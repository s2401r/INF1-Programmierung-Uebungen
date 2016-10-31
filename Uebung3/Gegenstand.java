public class Gegenstand {

    private int gewicht;

    private String material;

    private boolean elektrisch;

    public Gegenstand(int gewicht, String material, boolean elektrisch) {
        this.gewicht = gewicht;
        this.material = material;
        this.elektrisch = elektrisch;
    }

    public int getGewicht() {
        return gewicht;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isElektrisch() {
        return elektrisch;
    }
}
