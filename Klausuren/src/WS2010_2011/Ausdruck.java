package WS2010_2011;

/**
 * Created by Tobias on 07/02/2017.
 */

//!! JAVADOC !!

public abstract class Ausdruck {
    public abstract double auswerten(Belegung bel);

    public abstract Ausdruck ableiten(Variable x);

    public int vergleiche(Ausdruck b, Belegung bel) {

    }
}
