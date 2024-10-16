class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = "";
        for(int i = e; i>=s; i--){
            a += my_string.charAt(i);
        }

        answer = my_string.substring(0,s)+a+my_string.substring(e+1, my_string.length());
        return answer;
    }
}