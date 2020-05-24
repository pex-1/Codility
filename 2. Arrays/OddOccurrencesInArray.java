import java.util.HashMap;

public class OddOccurrencesInArray {

    public static void main(String args[]) {

        int result = solution(new int[]{1, 1, 2, 3, 2});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int value : A) {
            int repeat = 1;
            if (occurrences.get(value) != null) repeat = occurrences.get(value) + 1;

            occurrences.put(value, repeat);
        }

        for (int key : occurrences.keySet()) {
            if (occurrences.get(key) % 2 != 0) return key;
        }
        return 0;
    }
}
