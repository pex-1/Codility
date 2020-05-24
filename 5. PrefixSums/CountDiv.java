public class CountDiv {

    public static void main(String args[]) {

        int result = solution(0, 1, 11);
        System.out.println("result: " + result);
    }

    public static int solution(int A, int B, int K) {
        if (A == 0) return (B / K) + 1;
        return (B / K) - (A - 1) / K;
    }
}
