import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int lastnum = num_list[num_list.length-1];
        int secondnum = num_list[num_list.length-2];

        if(lastnum>secondnum){
            answer = Arrays.copyOf(num_list,num_list.length+1);
            answer[answer.length-1] = lastnum-secondnum;

            return answer;
        }
        else{
            answer = Arrays.copyOf(num_list,num_list.length+1);
            answer[answer.length-1] = lastnum*2;

            return answer;
        }
    }
}