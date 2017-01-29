public abstract class Zahl {
    public abstract Zahl add(Zahl zahl);

    public abstract Zahl mult(Zahl zahl);
}

public class Bruch extends Zahl {
    private GanzeZahl zaehler;
    private GanzeZahl nenner;

    private Bruch(GanzeZahl zaehler, GanzeZahl nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public GanzeZahl getNenner() {
        return this.nenner;
    }

    public GanzeZahl getZaehler() {
        return this.zaehler;
    }

    public Zahl add(Zahl zahl) {
        if (zahl instanceof Bruch) {

        } else if (zahl instanceof GanzeZahl) {

        } else {

        }
    }

    public Zahl mult(Zahl zahl) {
        if (zahl instanceof Bruch) {

        } else if (zahl instanceof GanzeZahl) {

        } else {

        }
    }
}

public class GanzeZahl extends Zahl {
    private int wert = 0;

    public GanzeZahl(int wert) {
        this.wert = wert;
    }

    public int getWert() {
        return this.wert;
    }

    public Zahl add(Zahl zahl) {
        if (zahl instanceof Bruch) {
            return new Bruch(
                    new GanzeZahl(
                            ((Bruch) zahl).getZaehler().getWert() + this.wert * ((Bruch) zahl).getNenner().getWert()),
                    (Bruch) zahl).getNenner();
        } else if (zahl instanceof GanzeZahl) {
            return new GanzeZahl(this.wert + ((GanzeZahl) zahl).getWert());
        } else {
            return this;
        }
    }

    public Zahl mult(Zahl zahl) {
        if (zahl instanceof Bruch) {

        } else if (zahl instanceof GanzeZahl) {

        } else {

        }
    }
}
