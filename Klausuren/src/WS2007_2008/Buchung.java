package WS2007_2008;

import java.util.Date;

/**
 * Created by Tobias on 07/02/2017.
 */
public class Buchung {
private Date datum;
private int übernachtungen;
private Zimmer zimmer;

    public Date getDatum() {
        return datum;
    }

    public int getÜbernachtungen() {
        return übernachtungen;
    }

    public Zimmer getZimmer() {
        return zimmer;
    }

    public double getBuchungsPreis(){
        return this.zimmer.getPreis() * this.übernachtungen;
    }

    public Buchung(Date datum, int übernachtungen, Zimmer zimmer) {
        this.datum = datum;
        this.übernachtungen = übernachtungen;
        this.zimmer = zimmer;
    }
}
