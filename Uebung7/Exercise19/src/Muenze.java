
import java.util.LinkedList;

/**
 * Created by Tobias on 29/11/2016.
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

    private int value;

    Muenze(int value) {
        this.value = value;
    }

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

    public int getValue() {
        return value;
    }
}
