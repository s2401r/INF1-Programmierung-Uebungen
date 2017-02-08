package WS2010_2011;

/**
 * Created by Tobias on 07/02/2017.
 */
public class Multiplikation extends  Ausdruck{
    private Ausdruck faktor1;
    private Ausdruck faktor2;

    public Multiplikation(Ausdruck faktor1, Ausdruck faktor2) {
        this.faktor1 = faktor1;
        this.faktor2 = faktor2;
    }
}
