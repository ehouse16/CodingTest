import java.lang.reflect.Array;
import java.util.Arrays;

class  Solution {
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length<=10){
            answer = 1;
            for (int j = 0; j < arr.length; j++) {
                answer *= arr[j];
            }
        }
        else{
            for (int j = 0; j < arr.length; j++) {
                answer +=arr[j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] b = {2,3,4,5};

        Solution s = new Solution();
        int answer = s.solution(a);
        int answer2= s.solution(b);
        System.out.println(answer);
        System.out.println(answer2);

    }

}