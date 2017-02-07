package SS2005;

/**
 * Created by Tobias on 06/02/2017.
 */
public class Flughafen {
    private String name;


    public static int fuckOff = 1;

    public Flug[] getDepartures() {
        return departures;
    }

    private Flug[] departures = new Flug[500];

    public Flughafen(String name) {
        this.name = name;
    }

    public boolean equals(Flughafen flughafen) {
        return this.name.equals(flughafen.name);
    }

    public void neuerFlug(Flughafen ziel, int abflugZeit, int dauer) throws IllegalArgumentException {
        Flug flug = new Flug(this, ziel, abflugZeit, dauer);
        addToArray(flug);

        int test = fuckOff + 7;
    }

    public Flug[] sucheVerbindung(Flughafen ziel, int abflugZeit, int maxUmsteigen) throws IllegalArgumentException {
        this.maxUmsteigen = maxUmsteigen;
        this.bestsolution = maxUmsteigen;
        this.connection = new Flug[maxUmsteigen];

        if (findConnection(this, ziel, abflugZeit,0) == true) {
            return connection;
        } else {
            return null;
        }
    }

    public int maxUmsteigen = 0;
    public int bestsolution = 0;
    public Flug[] connection;

    public int dayTime = 0;

    public boolean findConnection(Flughafen start, Flughafen ziel, int abFlugZeit, int depth) {
        boolean found = false;
        if (depth < bestsolution) {
            //for (Person p : start.getFreunde()) {
            for (int i = 0; i < 500; i++) {
                if (start.getDepartures()[i] != null) {
                    if (ziel.equals(start.getDepartures()[i].getZiel())

                            && start.getDepartures()[i].getStartzeit() >= abFlugZeit
                            && start.getDepartures()[i].getFlugdauer() < 1339
                            && depth < bestsolution) {


                        bestsolution = depth;
                        connection = new Flug[maxUmsteigen];
                        connection[depth] = start.getDepartures()[i];
                        found = true;
                        break;
                    }
                    if (findConnection(start.getDepartures()[i].getZiel(), ziel, start.getDepartures()[i].getFlugdauer(), depth + 1)) {
                        connection[depth] = start.getDepartures()[i];
                        found = true;
                    }
                }
            }
        }
        return found;
    }

    private boolean addToArray(Flug flug) {
        for (int i = 0; i < 500; i++) {
            if (departures[i] != null) {
                continue;
            } else {
                departures[i] = flug;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
