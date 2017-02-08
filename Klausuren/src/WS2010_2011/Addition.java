package WS2010_2011;

/**
 * Created by Tobias on 08/02/2017.
 */
public class Addition extends Ausdruck {
    private Ausdruck summand1;
    private Ausdruck summand2;

    public Addition(Ausdruck summand1, Ausdruck summand2) {
        this.summand1 = summand1;
        this.summand2 = summand2;
    }
}

