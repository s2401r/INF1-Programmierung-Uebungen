public class SchleifenTypen {

    /**
     * Berechnet Aufgabe 11 a mit Hilfe einer Do-While-Schleife
     *
     * @param x Basis der Berechnung
     * @return Ergebnis der Berechnung
     */
    public static Integer a_doWhile(int x) {
        int i = 0;
        Integer result;

        do {
            result = ++i * i;
        } while (result < x);

        return result;
    }

    public static Integer a_while(int x) {
        // Implementieren Sie a_doWhile mit Hilfe einer While-Schleife!
        int i = 0;
        Integer result = ++i * i;
        while (result < x) {
            result = ++i * i;
        }
        return result;
    }

    public static Integer a_for(int x) {
        // Implementieren Sie a_doWhile mit Hilfe einer For-Schleife!
        int i = 0;
        Integer result = ++i * i;
        for (; result < x; ) {
            result = ++i * i;
        }
        return result;
    }

    /**
     * Berechnet Aufgabe 11 b mit Hilfe einer While-Schleife
     *
     * @param x Basis der Berechnung
     * @return Ergebnis der Berechnung
     */
    public static String b_while(int x) {
        String result = "";
        while (result.length() < x) {
            result += 0.0 / 0.0;
        }
        result += "Batman";
        return result;
    }

    public static String b_doWhile(int x) {
        // Implementieren Sie b_while mit Hilfe einer Do-While-Schleife!
        String result = "";
        do {
            result += 0.0 / 0.0;
        }
        while (result.length() < x);
        result += "Batman";
        return result;
    }

    public static String b_for(int x) {
        // Implementieren Sie b_while mit Hilfe einer For-Schleife!
        String result = "";
        for (int i = 0; i < x; i += 3) {
            result += 0.0 / 0.0;
        }
        result += "Batman";
        return result;
    }
}
