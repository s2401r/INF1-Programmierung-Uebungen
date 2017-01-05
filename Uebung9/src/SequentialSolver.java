
public class SequentialSolver extends Solver {

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
        private boolean cancel = true;

        public SequentialSolverThread(Solver solver) {
            this.solver = solver;
        }

        public void run() {
            //Wiederhole bis jede Berechnung innerhalb von epsilon liegt
            do {
                cancel = true;
                //Durchlaufen der Matrix in x-Richtung
                for (int x = 0; x < matrix.getSize(); x++) {
                    //Durchlaufen der Matrix in y-Richtung
                    for (int y = 0; y < matrix.getSize(); y++) {
                        //Berechnen des Wertes
                        double result = solve(x, y);
                        //Prüfen ob der Wert innerhalb von espilon liegt
                        double change = result - matrix.getValue(x, y);
                        if (change > epsilon) {
                            cancel = false;
                        }
                        //Speichern des neuen Werts in der Matrix
                        matrix.setValue(result, x, y);
                    }
                }
                //Starten der nächsten Iteration
                matrix.nextIteration();

                //Wenn ein Wert die Grenzen von epsilon überschritten hat wird wiederholt
            } while (!cancel);

            //Wenn alle Werte innerhalb der Grenzen liegen wird die Berechnung abgeschlossen
            solver.finish();
        }

        private double solve(int x, int y) {
            double result = getMatrixPointValue(x - 1, y) +
                    getMatrixPointValue(x, y - 1) +
                    getMatrixPointValue(x + 1, y) +
                    getMatrixPointValue(x, y + 1);
            result *= 0.25;

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
