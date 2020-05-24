import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public static void main(String args[]) {

        int result = solution(new int[]{1, 4, 2, 3, 5});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {
        Set<Integer> numbers = new HashSet<>();
        int max = 0;

        for (int value : A) {
            if (max < value) max = value;
            numbers.add(value);
        }
        if (numbers.size() == A.length && max == A.length) return 1;
        return 0;
    }
}
