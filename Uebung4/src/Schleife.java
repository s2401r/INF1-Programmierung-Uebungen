/**
 * Created by Tobias on 08/11/2016.
 */
public class Schleife {

    //Gibt das groesste Element eines Arrays zurueck.
    public int max(int[] array) throws IllegalArgumentException {
        if (array != null) {
            int max = Integer.MIN_VALUE;

            for (int i : array) {
                if (i >= max) {
                    max = i;
                }
            }
            return max;
        } else {
            throw new IllegalArgumentException("array is null.");
        }
    }

    //Gibt das Skalarprodukt beider Arrays zurueck.
    public int skalarprodukt(int[] vektor1, int[] vektor2) throws IllegalArgumentException {
        if (vektor1 != null) {
            if (vektor2 != null) {
                if (vektor1.length == vektor2.length) {
                    int result = 0;
                    for (int i = 0; i < vektor1.length || i < vektor2.length; i++) {
                        result += vektor1[i] * vektor2[i];
                    }
                    return result;
                } else {
                    throw new IllegalArgumentException("Lenght of Vektor1 and Vektor2 have to be the same.");
                }
            } else {
                throw new IllegalArgumentException("vektor2 is null.");
            }
        } else {
            throw new IllegalArgumentException("vektor1 is null.");
        }
    }

    //Wenn array mind. eine Zahl doppelt enthalt -> true; andernfalls false
    public boolean hasDoppelte(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int j =0; j < array.length; j++) {
                    if (i != j && array[i] == array[j]) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            throw new IllegalArgumentException("array is null.");
        }
    }
}
