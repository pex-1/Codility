public class MaxSliceSum {

    public static void main(String args[]) {

        int result = solution(new int[]{1, 1, 1});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {
        if (A.length < 2) return A[0];
        int sum = A[0];
        int maxSlice = A[0];

        for (int i = 1; i < A.length; i++) {

            sum = Math.max(A[i], sum + A[i]);
            maxSlice = Math.max(maxSlice, sum);
        }
        return maxSlice;
    }
}
