public class FrogJmp {

    public static void main(String args[]) {

        int result = solution(3, 999111321, 7);
        System.out.println("result: " + result);
    }

    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
