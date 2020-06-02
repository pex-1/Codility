import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String args[]) {

        int result = solution(new int[]{-3, 1, 2, -2, 5, 6});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int length = A.length;

        int max1 = A[length-1]*A[length-2]*A[length-3];
        int max2 = A[length-1]*A[0]*A[1];

        return Math.max(max1, max2);
    }
}
