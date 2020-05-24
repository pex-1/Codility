import static java.lang.Math.log;
import static java.lang.Math.pow;

public class BinaryGap {

    public static void main(String args[]) {
        int result = solution(2147483647);
        System.out.println("result: " + result);
    }

    public static int solution(int N) {
        int x = (int) (log(N) / log(2));

        int target = (int) pow(2, x);
        if (target == N) return 0;

        int count = 0;
        int result = 0;
        int biggestGap = 0;

        while (x > 0) {
            int temp = (int) pow(2, x);
            if (result + temp == N) break;
            if ((result + temp) < N) {
                if (count > biggestGap) biggestGap = count;
                count = 0;
                result += (int) pow(2, x);
            } else {
                count++;
                System.out.println("count:" + count);
            }
            x--;
        }
        return biggestGap > count ? biggestGap : count;
    }
}
