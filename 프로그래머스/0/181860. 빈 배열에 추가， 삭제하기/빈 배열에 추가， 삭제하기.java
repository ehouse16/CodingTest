import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(flag[i])
            {
                for (int j = 0; j < arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            }
            else{
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size()-1);
                }
            }
        }

        int a =0;
        answer = new int[list.size()];
        for(Integer i : list){
            answer[a++] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();

        int[] arr1 = {3,2,4,1,3};

        boolean[] b = {true,false,true,false,false};


        System.out.println(Arrays.toString(s.solution(arr1, b)));
    }
}

