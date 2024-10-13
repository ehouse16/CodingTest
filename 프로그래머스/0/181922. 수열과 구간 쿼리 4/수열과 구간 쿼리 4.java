import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            int num1 = queries[i][0];
            int num2 = queries[i][1];
            int num3 = queries[i][2];

            for (int j = num1; j <= num2; j++) {
                if(j%num3==0)
                    arr[j]++;
            }
        }
        answer = Arrays.copyOf(arr,arr.length);
        return answer;
    }
}