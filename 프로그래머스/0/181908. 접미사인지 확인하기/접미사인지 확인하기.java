class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        String[] arr = {};
        arr = new String[my_string.length()];

        for(int i = 0; i<my_string.length(); i++){
            arr[i] = my_string.substring(i,my_string.length());
        }

        for (int i = 0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase(is_suffix))
                answer = 1;
        }
        return answer;
    }
}