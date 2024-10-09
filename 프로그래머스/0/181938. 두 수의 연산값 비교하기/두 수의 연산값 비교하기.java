class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a) + Integer.toString(b);

        int answerint = Integer.parseInt(ab);

        if (answerint > 2*a*b) {
            answer = answerint;
            return answer;
        } else if (answerint < 2*a*b) {
            answer = 2*a*b;
            return answer;
        } else {
            answer = answerint;
            return answer;
        }
    }
}