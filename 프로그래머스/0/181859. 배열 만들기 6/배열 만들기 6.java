import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i<arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
                i+=1;
            }
            else{
                if(list.get(list.size()-1)==arr[i]){
                    list.remove(list.size()-1);
                    i+=1;
                }
                else{
                    list.add(arr[i]);
                    i+=1;
                }
            }
        }

        answer = new int[list.size()];

        int idx = 0;
        for(int a = 0; a<list.size();a++){
            answer[idx++] = list.get(a);
        }

        if(answer.length==0)
            return new int[] {-1};
        else
            return answer;
    }
}