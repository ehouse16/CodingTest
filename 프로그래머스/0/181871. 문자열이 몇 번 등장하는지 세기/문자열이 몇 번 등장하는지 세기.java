class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i <= myString.length()-pat.length(); i++) {
            String str = myString.substring(i,i+pat.length());
            System.out.println(str);
            if(str.equals(pat))
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        Solution s= new Solution();

        System.out.println(s.solution("banana","ana"));
        System.out.println(s.solution("aaaa","aa"));
    }
}

