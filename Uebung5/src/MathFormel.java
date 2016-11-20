/**
 * @author Name: <a href="mailto:t_hoge03@wwu.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 */

public class MathFormel {
    /**
     * Calculates the sinus function with the help of recursion
     *
     * @param x The value for sinus calculation
     * @return Calculated sinus value
     */
    public double loeseRekursiv(double x) {
        return getSine(x, 0);
    }

    /**
     * Calculates the sinus function with the help of recursion for given value
     *
     * @param x The value for sinus calculation
     * @param i The iterator value for sinus calculation
     * @return Calculated sinus value
     */
    public double getSine(double x, int i) {

        double tempResult;
        double result = 0;

        if (i % 2 == 0) {
            tempResult = numerator(x, 2 * i + 1) / denominator(2 * i + 1);
        } else {
            tempResult = -1 * numerator(x, 2 * i + 1) / denominator(2 * i + 1);
        }

        if (tempResult < -0.0000001 || tempResult > 0.0000001) {
            result = tempResult + getSine(x, i + 1);
        }

        return result;
    }

    /**
     * Calculates the numerator value for given x and i for sinus function
     *
     * @param x The value for sinus calculation
     * @param i The iterator value for sinus calculation
     * @return Calculated numerator value
     */
    public double numerator(double x, int i) {
        double result = 1;
        if (i > 0) {
            result = numerator(x, i - 1) * x;
        }
        return result;
    }

    /**
     * Calculates the denominator value i for sinus function
     *
     * @param i The iterator value for sinus calculation
     * @return Calculated denominator value
     */
    public double denominator(int i) {
        double result = 1;
        if (i > 0) {
            result = denominator(i - 1) * i;
        }
        return result;
    }

    /**
     * Calculates the sinus function with the help of loops
     *
     * @param x The value for sinus calculation
     * @return Calculated sinus value
     */
    public double loeseSchleife(double x) {
        double result = 0, tempResult = 0;
        int i = 0;

        do {
            double numerator = 1;
            int k = (2 * i) + 1;
            while (k > 0) {
                numerator *= x;
                k--;
            }

            double denominator = 1;
            for (int j = 1; j <= (2 * i) + 1; j++) {
                denominator *= j;
            }

            double multiplicand = 1;
            int l = i;
            while (l > 0) {
                multiplicand *= -1;
                l--;
            }

            tempResult = multiplicand * (numerator / denominator);

            if (Double.isNaN(tempResult)) {
                return result;
            }

            result += tempResult;
            i += 1;
        }
        while (!(tempResult > -0.0000001 && tempResult < 0.0000001));
        return result;
    }
}
