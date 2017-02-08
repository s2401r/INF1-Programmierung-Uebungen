package SS2008;

import java.util.HashMap;

/**
 * Created by Tobias on 07/02/2017.
 */
public class IntOperation {

    public static void main(String[] args) {
        int[] test1 = new int[]{13, 7, 10, 6};
        int[] test2 = new int[]{13, 8, 10, 4};

        int[] erg = diff1(test1, test2);
        System.out.print("[ ");
        for (int i = 0; i < erg.length; i++) {
            System.out.print(erg[i] + ", ");
        }
        System.out.println(" ]");

        erg = diff2(test1, test2);
        System.out.print("[ ");
        for (int i = 0; i < erg.length; i++) {
            System.out.print(erg[i] + ", ");
        }
        System.out.println(" ]");

        erg = diff3(test1, test2);
        System.out.print("[ ");
        for (int i = 0; i < erg.length; i++) {
            System.out.print(erg[i] + ", ");
        }
        System.out.println(" ]");
    }

    public static int[] diff1(int[] a, int[] b) {
        int[] erg = new int[a.length + b.length];
        int pivot = 0;

        //für alle Zahlen in a
        for (int i = 0; i < a.length; i++) {
            boolean contained = false;
            //für jede Zahl in b
            for (int j = 0; j < b.length; j++) {
                //Prüfe ob Zahl aus a ungleich Zahl aus b ist
                if (a[i] == b[j]) {
                    contained = true;
                }
            }

            if (!contained) {
                //füge Zahl a zum Ergebnis hinzu
                erg[pivot] = a[i];
                pivot++;
            }
        }

        //für alle Zahlen in b
        for (int j = 0; j < b.length; j++) {
            boolean contained = false;
            //für jede Zahl in a
            for (int i = 0; i < a.length; i++) {
                //Prüfe ob Zahl aus b ungleich Zahl aus a ist
                if (a[i] == b[j]) {
                    contained = true;
                }
            }

            if (!contained) {
                //füge Zahl b zum Ergebnis hinzu
                erg[pivot] = b[j];
                pivot++;
            }
        }

        return erg;
    }

    public static int[] diff2(int[] a, int[] b) {

        int la = a.length;
        int lb = b.length;
        int[] c = new int[la + lb];
        System.arraycopy(a, 0, c, 0, la);
        System.arraycopy(b, 0, c, la, lb);

        //für alle Zahlen in a
        for (int i = 0; i < c.length; i++) {
            //für jede Zahl in b
            for (int j = 0; j < c.length; j++) {
                //Prüfe ob Zahl aus a ungleich Zahl aus b ist
                int i1 = c[i];
                int i2 = c[j];
                if (i != j && i1 == i2) {
                    //füge Zahl a zum Ergebnis hinzu
                    int number = c[i];
                    for (int k = 0; k < c.length; k++) {
                        if (c[k] == number) {
                            c[k] = 0;
                        }
                    }
                }
            }
        }
        return c;
    }

    public static int[] diff3(int[] a, int[] b) {

        int la = a.length;
        int lb = b.length;
        int[] c = new int[la + lb];
        System.arraycopy(a, 0, c, 0, la);
        System.arraycopy(b, 0, c, la, lb);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : c) {
            if (map.containsKey(i)) {
                int k = map.get(i);
                map.remove(i);
                map.put(i, k + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i = 0; i < map.size(); ) {
            if (map.get(map.keySet().toArray()[i]) > 1) {
                map.remove(map.keySet().toArray()[i]);
            } else {
                i++;
            }
        }

        int[] erg = new int[map.size()];
        for (int i = 0; i < map.size(); i++) {
            erg[i] = (int) map.keySet().toArray()[i];
        }
        return erg;
    }
}
