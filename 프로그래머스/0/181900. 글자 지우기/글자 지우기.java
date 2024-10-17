class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        arr = my_string.toCharArray();

        for (int i = 0; i < indices.length; i++) {
            int a = indices[i];

            arr[a]=' ';
        }
        for(int j = 0; j<arr.length;j++){
            if(arr[j] != ' ')
                answer+=arr[j];
        }
        return answer;
    }
}