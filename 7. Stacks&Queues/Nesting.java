public class Nesting {

    public static void main(String args[]) {

        int result = solution("(()(())())");
        System.out.println("result: " + result);
    }

    public static int solution(String S) {
        int open = 0;
        int closed = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.substring(i, i + 1).equals("(")) open++;
            else closed++;
            if (closed > open) return 0;
        }
        if (closed != open) return 0;
        return 1;
    }
}
