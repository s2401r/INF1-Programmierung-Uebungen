/**
 * Created by Tobias on 29/11/2016.
 */
public class Flugzeug implements Fahrzeug {
    private int speed = 0;
    private int seatCount = 0;
    private int maxHeight = 0;

    public int getMaximaleFlughoehe() {
        return maxHeight;
    }

    public void setMaximaleFlughoehe(int hoehe) {
        maxHeight = hoehe;
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

    public Flugzeug(int maxHeight, int speed, int seatCount) {
        this.maxHeight = maxHeight;
        this.speed = speed;
        this.seatCount = seatCount;
    }
}
