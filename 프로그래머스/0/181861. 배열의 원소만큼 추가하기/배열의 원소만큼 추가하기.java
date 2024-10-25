import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            len+=arr[i];
        }

        answer = new int[len];
        
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[a++] = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();

        int[] arr1 = { 5,1,4};
        int[] arr2 = {6,6};
        int[] arr3 = {1};

        System.out.println(Arrays.toString(s.solution(arr1)));
        System.out.println(Arrays.toString(s.solution(arr2)));
        System.out.println(Arrays.toString(s.solution(arr3	)));
    }
}

