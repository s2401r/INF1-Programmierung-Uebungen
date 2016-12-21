
public class ParallelSolver extends Solver{

    public ParallelSolver(int oben, int unten, int links, int rechts, double epsilon, HitzePanel.DatenMatrix matrix, SolverObserver toBeRefreshed){
        super(oben, unten, links, rechts, epsilon, matrix, toBeRefreshed);
    }

    /**
     * Zu implementieren. Loese das Problem anhand der Variablen oben, unten, links, rechts und epsilon.
     * Dabei wird die matrix verwendet, um die Temperaturentwicklung der Messpunkte der Metallplatte nachzuhalten.
     * In dieser Klasse ist das Problem parallel ueber den Einsatz von Thread zu loesen.
     */
    public void solve() {

        // ACHTUNG! Beispielcode bitte loeschen!
        for (int x = 0; x < matrix.getSize()/2; x++) {
            for (int y = 0; y < matrix.getSize()/2; y++) {
                matrix.setValue(100, x, y);
            }
        }
        for (int x = matrix.getSize()/2; x < matrix.getSize(); x++) {
            for (int y = matrix.getSize()/2; y < matrix.getSize(); y++) {
                matrix.setValue(100, x, y);
            }
        }
        matrix.nextIteration();
        this.finish();
        // ENDE! Beispielcode bitte loeschen!
    }
}
