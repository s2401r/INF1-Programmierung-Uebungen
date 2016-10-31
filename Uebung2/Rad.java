public class Rad {

//----------------------------------------------
//Properties
//----------------------------------------------

    private Felge felge;
    private Reifen reifen;

    public void setFelge(Felge felge) {
        if (felge != null) {
            this.felge = felge;
        }
    }

    public Felge getFelge() {
        if (this.felge != null) {
            return this.felge;
        }
        return null;
    }

    public void setReifen(Reifen reifen) {
        if (reifen != null) {
            this.reifen = reifen;
        }
    }

    public Reifen getReifen() {
        if (this.reifen != null) {
            return this.reifen;
        }
        return null;
    }

//----------------------------------------------
//Methods
//----------------------------------------------

    public Rad(Felge felge, Reifen reifen) {
        if (felge != null) {
            this.felge = felge;
        }
        if (reifen != null) {
            this.reifen = reifen;
        }
    }

    public int getKosten() {
        if (this.felge != null && this.reifen != null) {
            return this.reifen.getKosten() + this.felge.getKosten();
        }
        return 0;
    }
}
