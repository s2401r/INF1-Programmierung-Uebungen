/**
 * Stellt die Summe beliebig vieler berechenbarer Objekte dar.
 */
public class Summe extends Berechenbar {

    /**
     * Array aller berechenbarer Elemente der Summe.
     */
    public Berechenbar[] summanden;

    /**
     * Konstruktor
     *
     * @param summanden Beliebige Anzahl an Summanden.
     */
    public Summe(Berechenbar... summanden) {
        this.summanden = summanden;
    }

    /**
     * Berechnet die Summe aller Summanden.
     *
     * @param alle Gibt an, ob alle Summanden addiert werden oder nur der erste.
     * @return Summe der berechenbaren Elemente.
     */
    public int berechnen(boolean alle) {
        if (alle)
            int return = 0;
        for (int i = 0; i <= summanden.length; ++i) {
            return +=summanden[i].berechnen();
        }
        return return;
        else
        return summanden[0];
    }

    /**
     * Setzt die Summanden einer Summe neu.
     *
     * @param summanden neues Set an Summanden.
     */
    public void setSummanden(Berechenbar[] summanden) {
        this.summanden = summanden;
    }

}
