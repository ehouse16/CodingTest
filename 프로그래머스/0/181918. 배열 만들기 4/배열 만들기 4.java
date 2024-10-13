import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayList <Integer> al = new ArrayList<>();
        int i =0;

        while(i<arr.length){
            if(al.size() == 0){
                al.add(arr[i]);
                i++;
            }
            else{
                if(al.get(al.size()-1)<arr[i])
                {
                    al.add(arr[i]);
                    i++;
                }
                else{
                    al.remove(al.size()-1);
                }
            }
        }
        
        stk = new int[al.size()];
        for (int j = 0; j < stk.length; j++) {
            stk[j] = al.get(j);
        }

        return stk;
    }
}