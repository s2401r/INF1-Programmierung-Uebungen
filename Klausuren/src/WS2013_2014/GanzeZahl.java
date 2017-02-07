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
                        ((Bruch) zahl).getNenner()
                        );
        } else if (zahl instanceof GanzeZahl) {
                return new GanzeZahl(this.wert + ((GanzeZahl) zahl).getWert());
        } else {
                throw new IllegalArgumentException("type of zahl is not defined!");
        }
}

public Zahl mult(Zahl zahl) {
        if (zahl instanceof Bruch) {
                return new Bruch(
                        new GanzeZahl(
                                ((Bruch) zahl).getZaehler().getWert() * this.wert * ((Bruch) zahl).getNenner().getWert()),
                        ((Bruch) zahl).getNenner()
                        );
        } else if (zahl instanceof GanzeZahl) {
                return new GanzeZahl(this.wert * ((GanzeZahl) zahl).getWert());
        } else {
                throw new IllegalArgumentException("type of zahl is not defined!");
        }
}
}
