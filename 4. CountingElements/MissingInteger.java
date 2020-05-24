public class MissingInteger {

    public static void main(String args[]) {

        int result = solution(new int[]{1, 2, 3});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {
        int[] numbers = new int[A.length];

        for (int value : A) {
            if (value <= 0 || value > A.length) continue;
            numbers[value - 1] = 1;
        }

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 0) return j + 1;
        }

        return numbers.length + 1;
    }
}
