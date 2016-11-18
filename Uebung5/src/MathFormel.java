/**
 * Created by Tobias on 15/11/2016.
 */
public class MathFormel {

    public double loeseRekursiv(double x) {
        return getSine(x, 0);
    }

    public double getSine(double x, double i) {
        double numerator = exponentiation(x, (2 * i) + 1);
        double denominator = factorial((2 * i) + 1);
        double multiplicand = exponentiation(-1, i);

        double result = multiplicand * (numerator / denominator);

        if (Double.isNaN(result)) {
            return result;
        }

        if (result > exponentiation(-10, -7) && result < exponentiation(10, -7)) {
            return result;
        } else {
            return getSine(x, i + 1) + result;
        }
    }

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
        while (!(tempResult > exponentiation(-10, -7) && tempResult < exponentiation(10, -7)));
        return result;
    }

    public static double factorial(double x) {
        double result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double exponentiation(double base, double exponent) {
        double result = 1;

        if (exponent > 0) {
            while (exponent > 0) {
                result *= base;
                exponent--;
            }
        } else if (exponent < 0) {
            while (exponent < 0) {
                result /= base;
                exponent++;
            }
        }
        return result;


        /*
        if (exponent > 0) {
            double result = exponentiation(base, exponent - 1);
            return base * result;
        } else if (exponent < 0) {
            double result = exponentiation(base, exponent + 1);
            return result / base;
        } else {
            return 1;
        }
        */
    }
}
