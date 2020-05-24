public class TapeEquilibrium {

    public static void main(String args[]) {

        int result = solution(new int[]{-20, 5});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {

        int sumRight = 0;
        for (int value : A) {
            sumRight += value;
        }

        int minDifference = 0;
        int sumLeft = 0;
        int result = 10000000;

        for (int num = 0; num<A.length-1; num++) {
            sumLeft += A[num];
            sumRight = sumRight - A[num];

            minDifference = Math.abs(sumLeft - sumRight);
            if (result > minDifference) result = minDifference;
        }

        return result;
    }
}
