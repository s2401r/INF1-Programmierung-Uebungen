package SS2011;

public class Taylor {
    public static void main(String[] args) {
        System.out.println(cos(0.1, 0));
    }

    public static double cos(double x, double eps) {
        double lastResult = 0, actualResult = 0, result = 0;
        int n = 0;
        do {
            double vorzeichen = 1;
            if (n % 2 != 0) {
                vorzeichen = -1;
            }

            double pow = x;
            int k = 2 * n;
            if (k == 0) {
                pow = 1;
            } else {
                while (k > 1) {
                    pow *= x;
                    k--;
                }
            }

            double factorial = 1;
            int j = 2 * n;
            if (j == 0) {
                factorial = 1;
            } else {
                while (j > 0) {
                    factorial *= j;
                    j--;
                }
            }

            result += vorzeichen * pow / factorial;
            n++;
        } while (result >= eps);
        return result;
    }
}
