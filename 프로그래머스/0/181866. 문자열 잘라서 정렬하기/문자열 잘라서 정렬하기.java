import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        answer = myString.split("x");

        Arrays.sort(answer);

        for(String a : answer){
            if(!(a.isEmpty()))
            list.add(a);
        }
        answer = new String[list.size()];

        int i = 0;
        for(String str: list){
            answer[i++] = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        String str = "axbxcxdx";
        String str2 = "dxccxbbbxaaaa";
        String str3 = "bbxba";

        System.out.println(Arrays.toString(s.solution(str)));
        System.out.println(Arrays.toString(s.solution(str2)));
        System.out.println(Arrays.toString(s.solution(str3)));
    }
}

