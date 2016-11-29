/**
 * Represents a car.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public abstract class Auto implements Fahrzeug {
    //------------------------------------------------
    // ---- Fields
    //------------------------------------------------
    private int tireCount = 0;
    private int speed = 0;
    private int seatCount = 0;

    //------------------------------------------------
    // ---- Getter & Setter
    //------------------------------------------------

    /**
     * Constructs a new car with count of tires, speed and count of seats.
     *
     * @param tireCount the count of tires
     * @param speed     the speed
     * @param seatCount the count of the seats
     */
    public Auto(int tireCount, int speed, int seatCount) {
        this.tireCount = tireCount;
        this.speed = speed;
        this.seatCount = seatCount;
    }

    /**
     * Returns the count of tires.
     *
     * @return the count of tires
     */
    public int getAnzahlRaeder() {
        return tireCount;
    }

    /**
     * Sets the count of tires.
     *
     * @param anzahl the count of tires
     */
    public void setAnzahlRaeder(int anzahl) {
        tireCount = anzahl;
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
