/**
 * Created by Tobias on 29/11/2016.
 */
public abstract class Auto implements Fahrzeug {
    private int tireCount = 0;
    private int speed = 0;
    private int seatCount = 0;

    public int getAnzahlRaeder() {
        return tireCount;
    }

    public void setAnzahlRaeder(int anzahl) {
        tireCount = anzahl;
    }

    public int getGeschwindigkeit() {
        return speed;
    }

    public void setGeschwindigkeit(int gesch) {
        speed = gesch;
    }

    public int getAnzahlSitze() {
        return seatCount;
    }

    public void setAnzahlSitze(int anzahl) {
        seatCount = anzahl;
    }

    protected Auto(int tireCount, int speed, int seatCount) {
        this.tireCount = tireCount;
        this.speed = speed;
        this.seatCount = seatCount;
    }
}
