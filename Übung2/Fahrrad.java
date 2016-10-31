public class Fahrrad {
//----------------------------------------------
//Properties
//----------------------------------------------

    private Rad vorderrad;
    private Rad hinterrad;
    private Rahmen rahmen;

    public void setVorderrad(Rad vorderrad) {
        if (vorderrad != null) {
            this.vorderrad = vorderrad;
        }
    }

    public Rad getVorderrad() {
        if (vorderrad != null) {
            return this.vorderrad;
        }
        return null;
    }


    public void setHinterrad(Rad hinterrad) {
        if (hinterrad != null) {
            this.hinterrad = hinterrad;
        }
    }

    public Rad getHinterrad() {
        if (hinterrad != null) {
            return this.hinterrad;
        }
        return null;
    }


    public void setRahmen(Rahmen rahmen) {
        if (rahmen != null) {
            this.rahmen = rahmen;
        }
    }

    public Rahmen getRahmen() {
        if (rahmen != null) {
            return this.rahmen;
        }
        return null;
    }

//----------------------------------------------
//Methods
//----------------------------------------------

    public Fahrrad(Rad vorderrad, Rad hinterrad, Rahmen rahmen) {
        if (rahmen != null) {
            this.rahmen = rahmen;
        }
        if (vorderrad != null) {
            this.vorderrad = vorderrad;
        }
        if (hinterrad != null) {
            this.hinterrad = hinterrad;
        }
    }

    public int getKosten() {
        if (this.vorderrad != null && this.hinterrad != null && this.rahmen != null) {
            return vorderrad.getKosten() + hinterrad.getKosten() + rahmen.getKosten();
        }
        return 0;
    }
}
