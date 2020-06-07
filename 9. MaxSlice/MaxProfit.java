public class MaxProfit {

    public static void main(String args[]) {

        int result = solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {

        int maxProfit = 0;
        int sum = 0;


        for (int i = 1; i < A.length; i++) {
            sum = Math.max(sum + (A[i] - A[i-1]), 0);
            maxProfit = Math.max(sum, maxProfit);
        }
        return maxProfit;
    }
}
