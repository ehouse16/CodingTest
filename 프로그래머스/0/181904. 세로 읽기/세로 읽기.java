class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] a = new String[my_string.length()/m];

        int aa = 0;

        for(int i = 0;  i<=my_string.length()-m;i+=m) {
            a[aa++] = my_string.substring(i, i + m);
        }
        
        for(int j = 0;j<a.length;j++){
            answer += a[j].charAt(c-1);
        }
        return answer;
    }
}