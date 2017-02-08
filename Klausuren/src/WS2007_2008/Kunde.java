package WS2007_2008;

/**
 * Created by Tobias on 07/02/2017.
 */
public class Kunde {
    private String name;
    private Buchung[] buchungen;
    private int anzahlBuchungen;

    public String getName() {
        return name;
    }

    public Buchung[] getBuchungen() {
        return buchungen;
    }

    public Kunde(String name) {
        this.name = name;
    }

    private void addBuchungen(Buchung buchung) throws BuchungNullException {
        if (buchung != null) {
            for (int i = 0; i < buchungen.length; i++) {
                if (buchungen[i] == null) {
                    buchungen[i] = buchung;
                }
            }
        } else {
            throw new BuchungNullException("Buchung is null.");
        }
    }

    private void removeBuchung(Buchung buchung) throws BuchungNullException {
        if (buchung != null) {
            for (int i = 0; i < buchungen.length; i++) {
                if (buchungen[i] != null) {
                    if (buchungen[i].equals(buchung)) {
                        buchungen[i] = null;
                    }
                }
            }
        } else {
            throw new BuchungNullException("Buchung is null.");
        }
    }

    private int getÜbernachtungen(int zimmerNr) {
        int erg = 0;
        for (int i = 0; i < buchungen.length; i++) {
            if (buchungen[i] != null) {
                if (buchungen[i].getZimmer() != null) {
                    if (buchungen[i].getZimmer().getNummer() == zimmerNr) {
                        erg += buchungen[i].getÜbernachtungen();
                    }
                }
            }
        }
        return erg;
    }
}
