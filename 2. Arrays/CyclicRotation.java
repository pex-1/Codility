import java.util.Arrays;

public class CyclicRotation {

    public static void main(String args[]) {

        int[] result = solution(new int[]{1, 1, 2, 3, 5}, 42);
        System.out.println(Arrays.toString(result));

    }

    public static int[] solution(int[] A, int K) {

        if (A.length == 1 || K == 0 || K == A.length) return A;
        int[] solution = new int[A.length];

        int size = A.length;
        int position = 0;

        for (int i = 0; i < size; i++) {
            if (i + K >= size) position = (i + K) % size;
            else position = i + K;
            solution[position] = A[i];
        }

        return solution;
    }
}
