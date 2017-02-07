package SS2005;

/**
 * Created by Tobias on 05/02/2017.
 */
public class Exponent {
    public static void main(String[] args) {
        System.out.println(exp(3, 0.000001));
    }

    public static double exp(double x, double eps) {

        double lastTerm = 0, actualTerm = 0;
        int i = 1;

        do {
            double factorial = 1;
            int j = i;
            while (j > 0) {
                factorial *= j;
                j--;
            }

            double pow = x;
            int k = i;
            while (k > 1) {
                pow *= x;
                k--;
            }

            lastTerm = actualTerm;
            actualTerm += 1 / factorial * pow;

            i++;
            System.out.println(i);
        } while (actualTerm - lastTerm > eps);
        return 1 + actualTerm;
    }


    public static double exp2(double x, double eps) {
        double actualTerm = 0;
        double lastTerm = 0;
        int i = 1;
        do {
            double fak = 1;
            int j = i;
            while (j > 0) {
                fak *= j;
                j--;
            }

            double pow = x;
            int o = i;
            while (o > 1) {
                pow = pow * x;
                o--;
            }

            lastTerm = actualTerm;
            actualTerm += 1 / fak * pow;
            i++;
        } while (actualTerm - lastTerm > eps);
        return 1 + actualTerm;
    }

}
