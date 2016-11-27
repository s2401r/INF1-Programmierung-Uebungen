/**
 * Representiert eine einfache Zahl.
 */
public class Zahl implements Berechenbar {

    /** Wert der Zahl */
    private static int wert;

    /**
     * Konstruktor
     * @param wert Wert der Zahl.
     */
    public Zahl(int wert){
        this.wert = wert;
        //return new Zahl(wert);
    }

    /**
     * Gibt den Wert der Zahl zurück.
     * @return wert.
     */
    public int berechnen(){
        return wert;
    }
}