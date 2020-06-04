public class Dominator {

    public static void main(String args[]) {

        int result = solution(new int[]{});
        System.out.println("result: " + result);
    }


    public static int solution(int[] A) {
        if(A.length < 1) return -1;
        int dominator = A[0];
        int stackSize = 1;

        for (int i = 1; i < A.length; i++) {
            if (stackSize == 0) {
                stackSize = 1;
                dominator = A[i];
            } else {
                if (dominator != A[i]) stackSize -= 1;
                else stackSize += 1;
            }
        }
        if (stackSize == 0) return -1;

        int count = 0;
        int result = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == dominator) {
                count++;
                result = i;
            }
        }

        if (count > A.length / 2) return result;
        return -1;
    }
}
