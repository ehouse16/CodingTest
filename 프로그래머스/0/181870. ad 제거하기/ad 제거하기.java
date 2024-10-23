import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        String[] answer = {};
        int num = strArr.length;
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].contains("ad")){
                num--;
            }
            else{
                list.add(strArr[i]);
            }
        }

        answer= new String[num];

        for(int i = 0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        String[] str = {"and","notad","abcd"};
        String[] str2 = {"there","are","no","a","ds"};
        System.out.println(Arrays.toString(s.solution(str)));
        System.out.println(Arrays.toString(s.solution(str2)));
    }
}

