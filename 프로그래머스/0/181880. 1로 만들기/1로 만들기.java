import java.lang.reflect.Array;
import java.util.Arrays;

class  Solution {
    public int solution(int[] arr) {
        int answer = 0;

        for (int j = 0; j < arr.length; j++) {
            int value = arr[j];

            while(value != 1){
                if(value %2==0) {
                    value /= 2;
                    answer++;
                }
                else {
                    value = (value - 1) / 2;
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {12,4,15,1,14};

        Solution s = new Solution();
        int answer = s.solution(a);
        System.out.println(answer);
    }

}