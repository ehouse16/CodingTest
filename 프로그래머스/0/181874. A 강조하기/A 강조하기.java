import java.lang.reflect.Array;
import java.util.Arrays;

class  Solution {
    public String solution(String myString) {
        String answer = "";

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(myString.charAt(i) == 'a'){
                answer+=Character.toUpperCase(c);
            }
            else if(myString.charAt(i) == 'A')
                answer+=Character.toUpperCase(c);
            else{
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
       String str = "abstract algebra";
       String str2 = "PrOgRaMmErS";

       Solution s = new Solution();

        System.out.println(s.solution(str));
        System.out.println(s.solution(str2));
    }

}