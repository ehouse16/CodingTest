class Solution {
    public int solution(int a, int b) {
        int answer = 0;
    
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);

        int answerint = Integer.parseInt(ab);
        int answer2int = Integer.parseInt(ba);

        if (answerint > answer2int){
            answer = answerint;
            return answer;
        }
        else if (answerint < answer2int){
            answer = answer2int;
            return answer;
        }
        else{
            answer = answerint;
            return answer;
        }
    }
}