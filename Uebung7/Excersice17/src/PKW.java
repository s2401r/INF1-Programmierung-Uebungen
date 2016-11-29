/**
 * Represents a car for transporting persons.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public class PKW extends Auto {

    //------------------------------------------------
    // ---- Constructor
    //------------------------------------------------

    /**
     * Constructs a new car with count of tires, speed and count of seats.
     *
     * @param tireCount the count of tires
     * @param speed     the speed
     * @param seatCount the count of the seats
     */
    public PKW(int tireCount, int speed, int seatCount) {
        super(tireCount, speed, seatCount);
    }
}
