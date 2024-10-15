import java.util.*;
class Solution {
    public String[] solution(String my_string) {
       String[] answer = {};
        answer = new String[my_string.length()];

        String tmp = "";

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            tmp = "";
            for (int j = i; j < my_string.length(); j++) {
                tmp+=my_string.charAt(j);
            }
            arr.add(tmp);
        }
        Collections.sort(arr);

        int size=0;
        for(String temp : arr){
            answer[size++] = temp;
        }
        return answer;
        
        /*
        String[] answer = {};
        answer = new String[my_string.length()];

        for(int i = 0; i<my_string.length(); i++){
            answer[i] = my_string.substring(i,my_string.length());
        }
        Arrays.sort(answer);

        return answer;*/
    }
}