/**
 * Created by Tobias on 08/11/2016.
 */
public class SchleifeTest {
    public static void main(String[] args) {
        Schleife schleife = new Schleife();

        int[] scalarArray1 = new int[]{1, 2, 3, 4};
        int[] scalarArray2 = new int[]{5, 6, 7, 8};

        System.out.println("Skalarprodukt: " + schleife.skalarprodukt(scalarArray1, scalarArray2));


        int[] maxArray = new int[]{5, 1, 7, 2};

        System.out.println("Maximalwert: " + schleife.max(maxArray));


        int[] doubleArray = new int[]{5, 1, 7, 2, 8, 4, 3, 7, 9};

        System.out.println("Doppelwert: " + schleife.hasDoppelte(doubleArray));
    }
}
