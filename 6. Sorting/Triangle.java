import java.util.Arrays;

public class Triangle {

    public static void main(String args[]) {

        int result = solution(new int[]{-3, 1, 2, -2, 5, 6});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] < 0) continue;
            int P = i;
            int Q = i + 1;
            int R = i + 2;
            boolean condition1 = A[Q] - A[P] < A[R];
            boolean condition2 = A[R] - A[Q] < A[P];
            boolean condition3 = A[R] - A[P] < A[Q];
            if (condition1 && condition2 && condition3) return 1;
        }
        return 0;

    }
}
