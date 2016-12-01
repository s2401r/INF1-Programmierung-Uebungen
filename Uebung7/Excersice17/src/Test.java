/**
 * Created by Tobias on 01/12/2016.
 */
public class Test {
    public static void main(String[] args) {
        PKW pkw = new PKW(4, 160, 5);

        LKW lkw = new LKW(10, 90, 2, 25000);

        Flugzeug plane = new Flugzeug(30000,900,800);

        pkw.getAnzahlRaeder();
    }
}
