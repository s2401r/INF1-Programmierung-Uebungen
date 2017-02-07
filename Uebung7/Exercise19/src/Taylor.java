public class Taylor {
    public static void main(String[] args) {
        System.out.println(sin(2, 0.0000001));
    }

    public static double sin(double x, double eps) {
        double lastResult = 0, actualResult = 0,positivActualResult= 0 , result = 0;
        int n = 0;
        do {
            double vorzeichen = 1;
            if (n % 2 != 0) {
                vorzeichen = -1;
            }

            double zaehler = 1;
            double exponent = 2 * n + 1;
            while (exponent > 0) {

                zaehler = zaehler * x;
                exponent--;
            }

            double nenner = 1;
            double fak = 2 * n + 1;
            while (fak > 0) {
                nenner = nenner * fak;
                fak--;
            }

            lastResult = actualResult;
            actualResult = zaehler / nenner;

            result += vorzeichen * actualResult;

            positivActualResult = actualResult - lastResult;
            if(positivActualResult < 0){
                positivActualResult *= -1;
            }

            n++;
        } while (positivActualResult > eps);
        return result;
    }
}
