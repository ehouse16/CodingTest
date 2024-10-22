import java.lang.reflect.Array;
import java.util.Arrays;

class  Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if(i%2 == 0){
                answer[i] = strArr[i].toLowerCase();
            }
            else{
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }


    public static void main(String[] args) {
       String[] arr = {"AAA","BBB","CCC","DDD"};
       String[] arr2 = {"aBc","AbC"};

       Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(arr)));
        System.out.println(Arrays.toString(s.solution(arr2)));
    }

}