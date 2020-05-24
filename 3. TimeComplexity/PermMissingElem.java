public class PermMissingElem {

    public static void main(String args[]) {

        int result = solution(new int[]{1,2,3,5});
        System.out.println("result: " + result);
    }

    public static int solution(int[] A) {

        long requiredSum = ((A.length+1)*(A.length+2))/2;
        long actualSum = 0;

        for(int num : A){
            actualSum += num;
        }

        long result = requiredSum-actualSum;

        return (int)result;
    }
}
