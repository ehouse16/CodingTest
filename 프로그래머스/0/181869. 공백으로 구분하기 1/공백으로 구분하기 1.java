import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int cnt = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i)==' '){
                cnt++;
            }
        }
        answer = new String[cnt];

        answer = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        String str = "i love you";
        String str2 = "programmers";

        System.out.println(Arrays.toString(s.solution(str)));
        System.out.println(Arrays.toString(s.solution(str2)));
    }
}

