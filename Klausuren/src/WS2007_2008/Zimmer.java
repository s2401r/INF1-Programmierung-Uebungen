package WS2007_2008;

/**
 * Created by Tobias on 07/02/2017.
 */
public class Zimmer {
    private int nummer;
    private double preis;

    public int getNummer() {
        return nummer;
    }

    public double getPreis() {
        return preis;
    }

    public Zimmer(int nummer, double preis) {
        this.nummer = nummer;
        this.preis = preis;
    }
}
