package WS2007_2008;

/**
 * Created by Tobias on 07/02/2017.
 */
public class IntOperation {
    public static void main(String[] args) {
        int[] test = new int[]{13,7,8,10,4,6,7,3,6,8,1,3,1,7,5,4,7,8,9,5,4,3,3,1,1};
        int[] erg = hist(test);
        for (int i = 0; i < erg.length;i++) {
            int i1 = min(test) + i;
            System.out.println(i1 + ": " + erg[i] );
        }
    }

    public static int[] hist(int[] numbers) {
        int[] erg = new int[max(numbers) - min(numbers) + 1];
        int pivot = 0;
        int min = min(numbers);
        int max = max(numbers);
        for (int i = min; i <= max; i++) {
            erg[pivot] = countNumberInArray(numbers, i);
            pivot++;
        }
        return erg;
    }

    public static int countNumberInArray(int[] numbers, int number) {
        int erg = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                erg++;
            }
        }
        return erg;
    }

    public static int min(int[] numbers) {
        int erg = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < erg) {
                erg = numbers[i];
            }
        }
        return erg;
    }

    public static int max(int[] numbers) {
        int erg = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > erg) {
                erg = numbers[i];
            }
        }
        return erg;
    }
}
