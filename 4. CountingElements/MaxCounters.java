import java.util.Arrays;

public class MaxCounters {

    public static void main(String args[]) {

        int[] result = solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        System.out.println("result: " + Arrays.toString(result));
    }

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxNum = 0;
        int min = 0;

        for (int pos : A) {
            if (pos <= N) {
                if (counters[pos - 1] < min) {
                    counters[pos - 1] = min;
                }
                counters[pos - 1]++;
                if (counters[pos - 1] > maxNum) maxNum = counters[pos - 1];
            } else {
                min = maxNum;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < min) counters[i] = min;
        }
        return counters;
    }
}
