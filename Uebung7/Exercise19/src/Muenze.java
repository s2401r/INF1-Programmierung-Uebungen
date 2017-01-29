import java.util.LinkedList;



public enum Muenze {
    ZweiEuro(200), EinEuro(100), FuenfzigCent(50), ZwanzigCent(20), ZehnCent(10), FuenfCent(5), ZweiCent(2), EinCent(1);
    private int wert;
    private Muenze (int wert) {
        this.wert = wert;
    }
    public int getValue() {
        return this.wert;
    }

    public static LinkedList<Muenze> getMuenzen(int wertInCent) throws IllegalArgumentException{
        if (wertInCent < 0) {
            throw new IllegalArgumentException("wert ist negativ!");
        }
        LinkedList<Muenze> a = new LinkedList<Muenze>();
        for(Muenze m : Muenze.values()) {
            while (wertInCent >= m.getValue()) {
                a.add(m);
                wertInCent -= m.getValue();
            }
        }
        System.out.println(a);
        return a;

    }
    public static void Main (String[] args) {
        getMuenzen(121);
    }
}