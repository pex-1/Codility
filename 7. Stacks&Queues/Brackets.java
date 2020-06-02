import java.util.HashMap;
import java.util.Stack;

public class Brackets {

    public static void main(String args[]) {

        int result = solution("([)()]");
        System.out.println("result: " + result);
    }

    public static int solution(String S) {
        if (S.length() == 0) return 1;
        HashMap<String, String> brackets = new HashMap<>();

        brackets.put(")", "(");
        brackets.put("]", "[");
        brackets.put("}", "{");

        Stack<String> input = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            String bracket = S.substring(i, i + 1);
            if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{")) {
                input.push(bracket);
            } else {
                if(input.size() == 0) return 0;
                String pop = input.pop();
                if (!pop.equals(brackets.get(bracket))) return 0;
            }
        }
        return input.size() == 0 ? 1 : 0;
    }
}
