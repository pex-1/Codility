import java.util.Stack;

public class Fish {

    public static void main(String args[]) {

        int result = solution(new int[]{4, 3, 2, 1, 20}, new int[]{1, 1, 1, 1, 0});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A, int[] B) {
        Stack<Integer> upstream = new Stack<>();
        Stack<Integer> downStream = new Stack<>();


        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                upstream.push(A[i]);
                int repeat = downStream.size();
                for (int j = 0; j < repeat; j++) {
                    if (downStream.lastElement() > A[i]) {
                        upstream.pop();
                        break;
                    } else {
                        downStream.pop();
                    }
                }
            } else {
                downStream.push(A[i]);
            }
        }

        return upstream.size() + downStream.size();
    }
}
