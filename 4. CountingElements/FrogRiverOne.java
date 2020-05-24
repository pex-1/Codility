import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String args[]) {

        int result = solution(5, new int[]{9,3,1,4,2,3,5});
        System.out.println("result: " + result);
    }

    public static int solution(int X, int[] A) {
        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i<A.length; i++){
            if(A[i] <= X) hashSet.add(A[i]);
            if(hashSet.size() == X) return i;
        }
        return -1;
    }
}
