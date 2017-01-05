
public class SequentialSolver extends Solver {

    private boolean abbruch = true;

    public SequentialSolver(int oben, int unten, int links, int rechts, double epsilon, HitzePanel.DatenMatrix matrix, SolverObserver toBeRefreshed) {
        super(oben, unten, links, rechts, epsilon, matrix, toBeRefreshed);
    }

    /**
     * Zu implementieren. Loese das Problem anhand der Variablen oben, unten, links, rechts und epsilon.
     * Dabei wird die matrix verwendet, um die Temperaturentwicklung der Messpunkte der Metallplatte nachzuhalten.
     * In dieser Klasse ist das Problem sequentiell zu loesen.
     */
    public void solve() {
        (new Thread(new SequentialSolverThread(this))).start();
    }


    public class SequentialSolverThread extends Thread {


        /**
         * Solver, to refresh UI
         */
        protected final Solver solver;

        public SequentialSolverThread(Solver solver) {
            this.solver = solver;
        }

        public void run() {
            do {
                abbruch = true;
                for (int x = 0; x < matrix.getSize(); x++) {
                    for (int y = 0; y < matrix.getSize(); y++) {
                        double result = solve(x, y);
                        double change = result - matrix.getValue(x, y);
                        if (change > epsilon) {
                            abbruch = false;
                        }
                        matrix.setValue(result, x, y);
                    }
                }
                matrix.nextIteration();
                //solver.finish();
            }
            while (!abbruch);

            solver.finish();
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
