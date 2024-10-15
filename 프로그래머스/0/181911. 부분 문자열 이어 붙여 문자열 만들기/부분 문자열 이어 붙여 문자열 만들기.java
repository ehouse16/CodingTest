class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String tmp = "";

        for (int i = 0; i < my_strings.length; i++) {
            tmp = "";
            for(int j = parts[i][0]; j<=parts[i][1]; j++){
                tmp += my_strings[i].charAt(j);
            }
            System.out.println(tmp);
            answer +=tmp;
        }
        return answer;
    }
}