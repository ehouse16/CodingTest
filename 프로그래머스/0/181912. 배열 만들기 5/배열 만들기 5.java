import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList();
        String tmp = "";

        for (int i = 0; i < intStrs.length; i++) {
            tmp = "";
            for (int j = s; j < s+l; j++) {
                tmp += intStrs[i].charAt(j);
            }
            System.out.println(tmp);
            int tmpint = Integer.parseInt(tmp);
            if (tmpint > k)
                arr.add(tmpint);
        }
        System.out.println(arr);
        int[] answer = new int[arr.size()];

        int size=0;
        for(Integer temp : arr){
            answer[size++] = temp;
        }
        return answer;
    }
}