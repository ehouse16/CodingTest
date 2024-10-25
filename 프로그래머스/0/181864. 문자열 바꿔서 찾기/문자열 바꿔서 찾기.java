import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i)=='A'){
                str+="B";
            }
            else{
                str+="A";
            }
        }
        if(str.contains(pat))
            answer = 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();

        System.out.println((s.solution("ABBAA", "AABB")));
        System.out.println((s.solution("ABAB", "ABAB")));
        System.out.println((s.solution( "AAABB", "BBB")));
    }
}

