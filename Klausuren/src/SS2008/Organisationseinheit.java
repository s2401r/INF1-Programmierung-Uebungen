package SS2008;

public class Organisationseinheit {
    private String name;

    private Organisationseinheit oberOrganisationseinheit = null;
    private Organisationseinheit[] unterOrganisatioseinheiten = new Organisationseinheit[10];
    private int anzahlUnterOrganisationseinheiten = 0;

    private Angestellter manager;
    private Angestellter[] mitarbeiter = new Angestellter[100];
    private int anzahlMitarbeiter = 0;

    public Organisationseinheit(String name, Angestellter manager) {
        this.name = name;
        this.manager = manager;
    }

    public Organisationseinheit[] getUnterOrganisatioseinheiten() {
        return unterOrganisatioseinheiten;
    }

    public String getName() {
        return name;
    }

    public Angestellter getManager() {
        return manager;
    }

    public void addMitarbeiter(Angestellter angestellter) throws MitarbeiterAlreadyMemberException {
        if (angestellter != null) {
            if (!hasMitarbeiter(angestellter)) {
                for (int i = 0; i < mitarbeiter.length; i++) {
                    if (mitarbeiter[i] == null) {
                        angestellter.setMitarbeiterVon(this);
                        mitarbeiter[i] = angestellter;
                        anzahlMitarbeiter++;
                    }
                }
            } else {
                throw new MitarbeiterAlreadyMemberException("angestellter is already member of Organisationseinheit.");
            }
        } else {
            throw new IllegalArgumentException("angestellter is null.");
        }
    }

    public void removeMitarbeiter(Angestellter angestellter) throws MitarbeiterNotMemberException {
        if (angestellter != null) {
            if (hasMitarbeiter(angestellter)) {
                for (int i = 0; i < mitarbeiter.length; i++) {
                    if (mitarbeiter[i] == null) {
                        if (mitarbeiter[i].equals(angestellter)) {
                            angestellter.setMitarbeiterVon(null);
                            mitarbeiter[i] = null;
                            anzahlMitarbeiter--;
                            break;
                        }
                    }
                }
            } else {
                throw new MitarbeiterNotMemberException("angestellter is not member of Organisationseinheit.");
            }
        } else {
            throw new IllegalArgumentException("angestellter is null.");
        }
    }

    public boolean hasMitarbeiter(Angestellter angestellter) throws IllegalArgumentException {
        if (angestellter != null) {
            return angestellter.getMitarbeiterVon().equals(this);
        } else {
            throw new IllegalArgumentException("angestellter is null.");
        }
    }
}
