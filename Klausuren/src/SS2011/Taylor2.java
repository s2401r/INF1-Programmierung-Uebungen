public class Taylor2 {
public static void main (String[] args){
        System.out.println(cos(2,0.001));
}

public static double cos(double x, double eps){
        double lastResult= 0, actualResult= 0, result = 0;
        int n = 0;
        do {
                double vorzeichen = 1;
                if (n % 2 != 0) {
                        vorzeichen = -1;
                }

                double zaehler = x;
                for(int i = 0; i < 2 * n; i++ ) {
                        zaehler = zaehler * zaehler;
                }

                double nenner = 1;
                for(int i = 1; i <= 2 * n; i++ ) {
                        nenner = nenner * i;
                }

                lastResult = actualResult;
                actualResult = zaehler / nenner;

                result += vorzeichen * actualResult;
                n++;
        } while((actualResult - lastResult) > eps);
        return result;
}
}
