class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        answer = new int[n/k];
        int a = 0;

        for(int i = k; i<=n; i++){
            if(i%k==0) {
                answer[a++] = i;
            }
        }
        return answer;
    }
}