import java.util.Stack;

public class StoneWall {

    public static void main(String args[]) {

        int result = solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8});
        System.out.println("result: " + result);
    }

    public static int solution(int[] H) {
        Stack<Integer> floors = new Stack<>();
        int lastLevel = 0;
        int count = 0;

        for (int value : H) {
            if (lastLevel == value) continue;
            lastLevel = value;
            if (floors.size() > 0 && floors.lastElement() >= value) {
                while (floors.size() > 0) {
                    if (floors.lastElement() == value || floors.lastElement() < value) break;
                    floors.pop();
                }
                if (floors.size() == 0 || floors.lastElement() < value) {
                    floors.push(value);
                    count++;
                }
            } else {
                floors.push(value);
                count++;
            }
        }
        return count;
    }
}
