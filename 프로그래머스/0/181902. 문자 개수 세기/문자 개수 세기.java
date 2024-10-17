class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = new int[52];

        int a = 0;

        for(int i = 0;i<my_string.length();i++){
            a=my_string.charAt(i);
            if(a>='A' && a<='Z')
                answer[a-'A']++;
            else if(a>='a' && a<='z')
                answer[a-'a'+26]++;
        }
        return answer;
    }
}