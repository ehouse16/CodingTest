import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        Arrays.fill(answer,-1);

        for (int i = 0; i < queries.length; i++) {
            int num1 = queries[i][0];
            int num2 = queries[i][1];
            int num3 = queries[i][2];

            for(int j = num1; j<=num2;j++){
                if(arr[j]>num3){
                    answer[i] = answer[i]==-1 ? arr[j] : Math.min(answer[i],arr[j]);
                }
            }
        }

        return answer;
    }
}