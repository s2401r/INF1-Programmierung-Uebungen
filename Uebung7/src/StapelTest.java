/**
 * Created by Tobias on 29/11/2016.
 */
public class StapelTest {
    public static void main(String[] args) {
        try {
            Stapel<Integer> stapel = new Stapel<>();
            stapel.legeDrauf(3);
            stapel.legeDrauf(new Integer(5));
            int element = stapel.nehmeHerunter();
            boolean istLeer = stapel.istLeer();

        } catch (StapelLeerException e) {
            e.printStackTrace();
        }
    }
}
