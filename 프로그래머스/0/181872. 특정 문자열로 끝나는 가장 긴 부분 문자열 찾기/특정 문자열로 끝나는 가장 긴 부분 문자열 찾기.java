import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        String str = s.solution("AbCdEFG", "dE");
        String str2 = s.solution("AAAAaaaa", "a");

        System.out.println(str);
        System.out.println(str2);

    }
    public String solution(String myString, String pat) {
        String answer = "";
        int num = myString.lastIndexOf(pat);
        answer = myString.substring(0,num+pat.length());
        return answer;
    }
}