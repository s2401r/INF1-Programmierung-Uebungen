
import java.util.LinkedList;

/**
 * Represents the european currency.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public enum Muenze {
    ZweiEuro(200),
    EinEuro(100),
    FuenfzigCent(50),
    ZwanzigCent(20),
    ZehnCent(10),
    FuenfCent(5),
    ZweiCent(2),
    EinCent(1);

    private final int value;

    //------------------------------------------------
    // ---- Constructor
    //------------------------------------------------

    /**
     * Constructs a new coin with given value.
     *
     * @param value The value of the coin
     */
    Muenze(int value) {
        this.value = value;
    }

    //------------------------------------------------
    // ---- Methods
    //------------------------------------------------

    /**
     * Generates an linkedList with smallest possible amount of coins which will be equivalent to the given value.
     *
     * @param value The value to be converted into a coinList
     * @return the linkedList with coins which was generated from the given value
     * @throws IllegalArgumentException if value is under zero
     */
    public static LinkedList<Muenze> getMuenzen(int value) throws IllegalArgumentException {
        if (value >= 0) {
            LinkedList<Muenze> result = new LinkedList<>();

            for (Muenze m : Muenze.values()) {
                if (value <= 0) {
                    break;
                } else {
                    int coinCount = (value - value % m.getValue()) / m.getValue();

                    for (int i = 0; i < coinCount; i++) {
                        result.add(m);
                    }

                    value -= m.getValue() * coinCount;
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("value is under zero");
        }
    }

    /**
     * Returns the value of a given coin.
     *
     * @return the value of a given coin
     */
    public int getValue() {
        return value;
    }
}
