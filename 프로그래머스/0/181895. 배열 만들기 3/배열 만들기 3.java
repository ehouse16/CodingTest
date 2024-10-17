class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];

        int idxlength = b1-a1+b2-a2;
        answer = new int[idxlength + 2];

        int idx = 0;

        for(int i = 0; i<2; i++){
            for(int j = intervals[i][0]; j<=intervals[i][1]; j++){
                answer[idx++] = arr[j];
            }
        }
        return answer;
    }
}