import java.lang.reflect.Array;
import java.util.Arrays;

class  Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        if(pat.length()>myString.length()){
            return answer;
        }
        else{
            String str = myString.toLowerCase();
            String pat2 = pat.toLowerCase();

            if(str.contains(pat2))
                answer = 1;
            else
                answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "AbCdEfG";
        String str2 = "aBc";

        String str3 = "aaAA";
        String str4 = "aaaaa";

        Solution s = new Solution();
        System.out.println(s.solution(str,str2));
        System.out.println(s.solution(str3,str4));
    }

}