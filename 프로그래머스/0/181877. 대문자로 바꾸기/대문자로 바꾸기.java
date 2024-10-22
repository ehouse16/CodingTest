import java.lang.reflect.Array;
import java.util.Arrays;

class  Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString.toUpperCase();
        return answer;
    }


    public static void main(String[] args) {
        String str = "AbCdEfG";
        String str2 = "AAA";

        Solution s = new Solution();
        System.out.println(s.solution(str));
        System.out.println(s.solution(str2));
    }

}