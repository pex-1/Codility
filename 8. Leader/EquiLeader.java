public class EquiLeader {

    public static void main(String args[]) {

        int result = solution(new int[]{4, 3, 4, 4, 4, 2});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {
        int leader = A[0];
        int stackSize = 1;

        for (int i = 1; i < A.length; i++) {
            if (stackSize == 0) {
                stackSize = 1;
                leader = A[i];
            } else {
                if (leader != A[i]) stackSize -= 1;
                else stackSize += 1;
            }
        }

        int count = 0;
        for (int value : A) {
            if (value == leader) count++;
        }

        if (count < A.length / 2) return 0;

        int leftCount = 0;
        int rightCount;

        int equiLeaders = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) leftCount++;

            if (leftCount > (i + 1) / 2) {
                rightCount = count - leftCount;

                if (rightCount > (A.length - i - 1) / 2) {
                    equiLeaders++;
                }
            }
        }

        return equiLeaders;
    }
}
