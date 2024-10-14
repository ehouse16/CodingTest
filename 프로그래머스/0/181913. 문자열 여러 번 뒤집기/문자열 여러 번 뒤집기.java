class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String tmp = "";
        int len = my_string.length();
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            tmp = "";

            for (int j = b; j >=a; j--) {
                tmp += my_string.charAt(j);
            }

            my_string = my_string.substring(0,a) + tmp + my_string.substring(b+1,len);
            answer = my_string;
        }

        return answer;
    }
}