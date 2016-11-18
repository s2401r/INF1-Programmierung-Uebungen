/**
 * @author Name: <a href="mailto:t_hoge03@wwu.de">Tobias Hoge</a>, Matrikelnummer: 439 224
 */
public class SchleifenTypen {

    /**
     * Calculates exercise 11 a with the help of a do-while-loop
     *
     * @param x Base of the calculation
     * @return Result of the calculation
     */
    public static Integer a_doWhile(int x) {
        int i = 0;
        Integer result;
        do {
            result = ++i * i;
        } while (result < x);

        return result;
    }

    /**
     * Calculates exercise 11 a with the help of a while-loop
     *
     * @param x Base of the calculation
     * @return Result of the calculation
     */
    public static Integer a_while(int x) {
        // Implementieren Sie a_doWhile mit Hilfe einer While-Schleife!
        int i = 0;
        Integer result = ++i * i;
        while (result < x) {
            result = ++i * i;
        }
        return result;
    }

    /**
     * Calculates exercise 11 a with the help of a for-loop
     *
     * @param x Base of the calculation
     * @return Result of the calculation
     */
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
     * Calculates exercise 11 b with the help of a while-loop
     *
     * @param x Base of the calculation
     * @return Result of the calculation
     */
    public static String b_while(int x) {
        String result = "";
        while (result.length() < x) {
            result += 0.0 / 0.0;
        }
        result += "Batman";
        return result;
    }

    /**
     * Calculates exercise 11 b with the help of a do-while-loop
     *
     * @param x Base of the calculation
     * @return Result of the calculation
     */
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

    /**
     * Calculates exercise 11 b with the help of a for-loop
     *
     * @param x Base of the calculation
     * @return Result of the calculation
     */
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
