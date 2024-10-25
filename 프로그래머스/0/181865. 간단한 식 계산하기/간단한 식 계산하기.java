import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(String binomial) {
        int answer = 0;

        String[] str = binomial.split(" ");

        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);

        switch (str[1]){
            case "+":
                answer = num1+num2;
                break;
            case "-":{
                answer = num1-num2;
                break;
            }
            case "*":
                answer = num1*num2;
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        String str = "43 + 12";
        String str2 = "0 - 7777";
        String str3 = "40000 * 40000";

        System.out.println((s.solution(str)));
        System.out.println((s.solution(str2)));
        System.out.println((s.solution(str3)));
    }
}

