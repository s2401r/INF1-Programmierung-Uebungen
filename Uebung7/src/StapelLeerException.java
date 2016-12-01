/**
 * Represents an exception which is thrown if the stack has no entries.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public class StapelLeerException extends Exception {

    //------------------------------------------------
    // ---- Constructor
    //------------------------------------------------

    /**
     * Constructs a new StapelLeerException with detailed message.
     *
     * @param message The detailed message.
     */
    public StapelLeerException(String message) {
        super(message);
    }
}
