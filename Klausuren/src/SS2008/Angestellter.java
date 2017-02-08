package SS2008;

/**
 * Created by Tobias on 07/02/2017.
 */
public class Angestellter {
    private String name;
    private Organisationseinheit managerVon;
    private Organisationseinheit mitarbeiterVon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organisationseinheit getManagerVon() {
        return managerVon;
    }

    public void setManagerVon(Organisationseinheit managerVon) {
        this.managerVon = managerVon;
    }

    public Organisationseinheit getMitarbeiterVon() {
        return mitarbeiterVon;
    }

    public void setMitarbeiterVon(Organisationseinheit mitarbeiterVon) {
        this.mitarbeiterVon = mitarbeiterVon;
    }

    public Angestellter(String name) {
        this.name = name;
    }

    public boolean isManagerVon(Angestellter angestellter) {
        return isAngestellterVon(angestellter, managerVon);
    }

    public boolean isAngestellterVon(Angestellter angestellter, Organisationseinheit organisationseinheit) {
        if (organisationseinheit == angestellter.getMitarbeiterVon()) {
            return true;
        } else {
            for (Organisationseinheit unterOrganisationseinheit : managerVon.getUnterOrganisatioseinheiten()) {
                if (unterOrganisationseinheit != null) {
                    if (unterOrganisationseinheit == angestellter.getMitarbeiterVon()) {
                        return true;
                    } else {
                        return isAngestellterVon(angestellter, unterOrganisationseinheit);
                    }
                }
            }
            return false;
        }
    }
}
