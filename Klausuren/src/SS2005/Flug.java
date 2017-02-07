package SS2005;

/**
 * Created by Tobias on 06/02/2017.
 */
public class Flug {
    public Flughafen getStart() {
        return start;
    }

    public void setStart(Flughafen start) {
        this.start = start;
    }

    public Flughafen getZiel() {
        return ziel;
    }

    public void setZiel(Flughafen ziel) {
        this.ziel = ziel;
    }

    public int getStartzeit() {
        return startzeit;
    }

    public void setStartzeit(int startzeit) {
        this.startzeit = startzeit;
    }

    public int getFlugdauer() {
        return flugdauer;
    }

    public void setFlugdauer(int flugdauer) {
        this.flugdauer = flugdauer;
    }

    private Flughafen start;

    public Flug(Flughafen start, Flughafen ziel, int startzeit, int flugdauer) {
        this.start = start;
        this.ziel = ziel;
        this.startzeit = startzeit;
        this.flugdauer = flugdauer;
    }

    private Flughafen ziel;
    private int startzeit;
    private int flugdauer;
}
