package WS2013_2014;

public class Bruch extends Zahl {
    private GanzeZahl zaehler;
    private GanzeZahl nenner;

    public Bruch(GanzeZahl zaehler, GanzeZahl nenner) {
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
            Bruch bruch = (Bruch) zahl;
            return new Bruch(
                    (GanzeZahl) bruch.getZaehler().add(this.zaehler),
                    (GanzeZahl) bruch.getNenner().add(this.nenner)
            );
        } else if (zahl instanceof GanzeZahl) {
            GanzeZahl ganzeZahl = (GanzeZahl) zahl;
            return new Bruch(
                    (GanzeZahl) this.getZaehler().add(ganzeZahl.mult(this.getNenner())),
                    this.getNenner()
            );
        } else {
            throw new IllegalArgumentException("type of zahl is not defined!");
        }
    }

    public Zahl mult(Zahl zahl) {
        if (zahl instanceof Bruch) {
            Bruch bruch = (Bruch) zahl;
            return new Bruch(
                    (GanzeZahl) bruch.getZaehler().mult(this.getZaehler()),
                    (GanzeZahl) bruch.getNenner().mult(this.getNenner())
            );
        } else if (zahl instanceof GanzeZahl) {
            GanzeZahl ganzeZahl = (GanzeZahl) zahl;
            return new Bruch(
                    (GanzeZahl) this.getZaehler().mult(ganzeZahl),
                    this.getNenner()
            );
        } else {
            throw new IllegalArgumentException("type of zahl is not defined!");
        }
    }
}
