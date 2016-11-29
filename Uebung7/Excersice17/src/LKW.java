/**
 * Represents a lorry.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public class LKW extends Auto {

    //------------------------------------------------
    // ---- Fields
    //------------------------------------------------
    private int maxLoad = 0;

    //------------------------------------------------
    // ---- Getter & Setter
    //------------------------------------------------

    /**
     * Constructs a lorry with given count of tires, speed, count of seats and it's maximum load.
     *
     * @param tireCount the count of tires
     * @param speed     the speed
     * @param seatCount the count of seats
     * @param maxLoad   the maximum load
     */
    public LKW(int tireCount, int speed, int seatCount, int maxLoad) {
        super(tireCount, speed, seatCount);
        this.maxLoad = maxLoad;
    }

    /**
     * Returns the maximal weigh which can be loaded into the lorry.
     *
     * @return the maximal weigh which can be loaded into the lorry
     */
    public int getMaximaleLast() {
        return maxLoad;
    }

    //------------------------------------------------
    // ---- Constructor
    //------------------------------------------------

    /**
     * Sets the maximal weigh which can be loaded into the lorry.
     *
     * @param last the maximal weigh which can be loaded into the lorry
     */
    public void setMaximaleLast(int last) {
        maxLoad = last;
    }
}
