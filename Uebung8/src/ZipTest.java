/**
 * Created by Tobias on 08/12/2016.
 */
public class ZipTest {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3,5};
        int[] array2 = new int[]{3, 5, 2};

        int[] result = Zip.zip(array1, array2, (i, j) -> i - j);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
