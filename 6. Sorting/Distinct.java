import java.util.Arrays;
import java.util.HashSet;

public class Distinct {

    public static void main(String args[]) {

        int result = betterSolution(new int[]{2, 1, 1, 2, 3, 1});
        System.out.println("result: " + result);

    }

    public static int solution(int[] A) {
        HashSet<Integer> distinct = new HashSet<>();
        for (int val : A) {
            distinct.add(val);
        }
        return distinct.size();
    }

    public static int betterSolution(int[] A) {
        Arrays.sort(A);
        if(A.length == 0) return 0;
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] != A[i]) count++;
        }

        return count;
    }
}
