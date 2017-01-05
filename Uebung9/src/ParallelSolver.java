import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ParallelSolver extends Solver {

    public ParallelSolver(int oben, int unten, int links, int rechts, double epsilon, HitzePanel.DatenMatrix matrix, SolverObserver toBeRefreshed) {
        super(oben, unten, links, rechts, epsilon, matrix, toBeRefreshed);
    }

    boolean calculationAboveEpsilon = true;
    boolean cancelCalculation = false;
    CyclicBarrier barrier;

    /**
     * Zu implementieren. Loese das Problem anhand der Variablen oben, unten, links, rechts und epsilon.
     * Dabei wird die matrix verwendet, um die Temperaturentwicklung der Messpunkte der Metallplatte nachzuhalten.
     * In dieser Klasse ist das Problem parallel ueber den Einsatz von Thread zu loesen.
     */
    public void solve() {

        int threadCount = 4;

        ArrayList<Thread> threadArrayList = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            threadArrayList.add(new ParallelSolverThread(threadCount, i, this));
        }

        barrier = new CyclicBarrier(threadCount, new Runnable() {
            public void run() {
                //System.out.println("CyclicBarrier continues.");
                matrix.nextIteration();

                if (calculationAboveEpsilon) {
                    cancelCalculation = true;
                } else {
                    calculationAboveEpsilon = true;
                }
            }
        });

        for (Thread t : threadArrayList) {
            t.start();
        }
    }

    public void finishCalculation() {
        this.finish();
    }

    public class ParallelSolverThread extends Thread {
        private final int threadCount;
        private final int threadNumber;
        private final Solver solver;

        public ParallelSolverThread(int threadCount, int threadNumber, Solver solver) {
            this.threadCount = threadCount;
            this.threadNumber = threadNumber;
            this.solver = solver;
        }

        public void run() {
            int xStart = 0;
            int xEnd = matrix.getSize() - 1;

            xStart = (matrix.getSize() / threadCount * (threadNumber));
            xEnd = (matrix.getSize() / threadCount * (threadNumber + 1)) - 1;

            System.out.println("Thread " + threadNumber + " xStart: " + xStart);
            System.out.println("Thread " + threadNumber + " xEnd: " + xEnd);

            while (!cancelCalculation) {
                try {
                    for (int x = xStart; x < xEnd || x < matrix.getSize(); x++) {
                        for (int y = 0; y < matrix.getSize(); y++) {
                            double result = solve(x, y);
                            double change = result - matrix.getValue(x, y);
                            if (change > epsilon) {
                                calculationAboveEpsilon = false;
                            }

                            matrix.setValue(result, x, y);
                        }
                    }

                    //System.out.println("Thread " + threadNumber + " awaits barrier.");
                    barrier.await();
                    //System.out.println("Thread " + threadNumber + " continues.");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }

            if (threadNumber == 0) {
                solver.finish();
            }
        }

        private double solve(int x, int y) {
            double result = getMatrixPointValue(x - 1, y) +
                    getMatrixPointValue(x, y - 1) +
                    getMatrixPointValue(x + 1, y) +
                    getMatrixPointValue(x, y + 1);
            result = result * 0.25;

            return result;
        }

        private double getMatrixPointValue(int x, int y) {
            if (x < 0) {
                return links;
            } else if (x > matrix.getSize() - 1) {
                return rechts;
            } else if (y < 0) {
                return oben;
            } else if (y > matrix.getSize() - 1) {
                return unten;
            } else {
                return matrix.getValue(x, y);
            }
        }
    }
}