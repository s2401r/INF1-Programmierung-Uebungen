import java.util.HashMap;

public class Numbers {

    public static void main(String[] args) {
        System.out.println(mostFrequently(new int[]{1, 2, 3, 4, 6, 8, 5, 3}));
    }

    public static int mostFrequently(int[] numbers) {
        HashMap<Integer, Integer> dic = new HashMap<>();

        for (int a : numbers)
        {
            if (dic.containsKey(a)) {
                int count = dic.get(a);
                dic.remove(a);
                dic.put(a, count + 1);
            } else {
                dic.put(a, 1);
            }
        }

        int highest = 0;
        int highestCount = 0;
        for (int a : dic.keySet()) {
            if (dic.get(a) > highestCount) {
                highest = a;
                highestCount = dic.get(a);
            } else if (dic.get(a) == highestCount) {
                if (a < highest) {
                    highest = a;
                    highestCount = dic.get(a);
                }
            }
        }
        return highest;
    }
}