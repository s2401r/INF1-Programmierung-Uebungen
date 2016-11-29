/**
 * Represents a vehicle.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public interface Fahrzeug {
    /**
     * Returns the speed of the vehicle.
     *
     * @return the speed of the vehicle
     */
    int getGeschwindigkeit();

    /**
     * Sets the speed of the vehicle.
     *
     * @param gesch the speed of the vehicle
     */
    void setGeschwindigkeit(int gesch);

    /**
     * Returns the count of the seats.
     *
     * @return the count of the seats
     */
    int getAnzahlSitze();

    /**
     * Sets the count of the seats.
     *
     * @param anzahl the count of the seats
     */
    void setAnzahlSitze(int anzahl);
}
