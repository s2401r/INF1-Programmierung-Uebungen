/**
 * Runs a given lambda expression.
 *
 * @author Name: <a href="mailto:t_hoge03@uni-muenster.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 * @author Name: <a href="mailto:a_mutz01@uni-muenster.de">Ann-Cathrin Mutz</a>, Matrikelnummer: 438 871
 * @author Name: <a href="mailto:f_inge03@uni-muenster.de">Fabian Ingenhorst</a>, Matrikelnummer: 441 378
 */
public class Zip {

    /**
     * Runs the given lambda expression for the two arrays.
     *
     * @param array1
     * @param array2
     * @param intOperation the given lambda expression
     * @return the result of the lambda expression with the two arrays.
     * @throws IllegalArgumentException if array1 or array2 or intOperation is null.
     */
    public static int[] zip(int[] array1, int[] array2, IntOperation intOperation) throws IllegalArgumentException {
        if (array1 != null) {
            if (array2 != null) {
                if (intOperation != null) {
                    int length = array1.length;
                    if (array2.length < length) {
                        length = array2.length;
                    }

                    int[] result = new int[length];

                    for (int i = 0; i < result.length; i++) {
                        result[i] = intOperation.TwoIntOperation(array1[i], array2[i]);
                    }

                    return result;
                } else {
                    throw new IllegalArgumentException("intOperation is null.");
                }
            } else {
                throw new IllegalArgumentException("array2 is null.");
            }
        } else {
            throw new IllegalArgumentException("array1 is null.");
        }
    }

    @FunctionalInterface
    public interface IntOperation {
        /**
         * Lambda expression for two given int numbers.
         *
         * @param i int 1
         * @param j int 2
         * @return the result of the lambda expression.
         */
        int TwoIntOperation(int i, int j);
    }
}
