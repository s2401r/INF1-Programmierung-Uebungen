/**
 * Represents an airplane.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public class Flugzeug implements Fahrzeug {
    //------------------------------------------------
    // ---- Fields
    //------------------------------------------------
    private int speed = 0;
    private int seatCount = 0;
    private int maxHeight = 0;

    //------------------------------------------------
    // ---- Getter & Setter
    //------------------------------------------------

    /**
     * Constructs a new airplane with maximum height, speed and count of seats.
     *
     * @param maxHeight the maximum height
     * @param speed     the speed
     * @param seatCount the count of seats
     */
    public Flugzeug(int maxHeight, int speed, int seatCount) {
        this.maxHeight = maxHeight;
        this.speed = speed;
        this.seatCount = seatCount;
    }

    /**
     * Returns the maximum height.
     *
     * @return the maximum height
     */
    public int getMaximaleFlughoehe() {
        return maxHeight;
    }

    /**
     * Sets the maximum height.
     *
     * @param hoehe the maximum height
     */
    public void setMaximaleFlughoehe(int hoehe) {
        maxHeight = hoehe;
    }

    /**
     * Returns the maximum speed.
     *
     * @return the maximum speed
     */
    public int getGeschwindigkeit() {
        return speed;
    }

    /**
     * Sets the maximum speed.
     *
     * @param gesch the speed of the vehicle
     */
    public void setGeschwindigkeit(int gesch) {
        speed = gesch;
    }

    /**
     * Return the counts of the seats.
     *
     * @return the counts of the seats
     */
    public int getAnzahlSitze() {
        return seatCount;
    }

    //------------------------------------------------
    // ---- Constructor
    //------------------------------------------------

    /**
     * Sets the count of the seats.
     *
     * @param anzahl the count of the seats
     */
    public void setAnzahlSitze(int anzahl) {
        seatCount = anzahl;
    }
}
