class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int time = 1;
        int add = 0;

        for (int i = 0; i < num_list.length; i++) {
            time *= num_list[i];
            add += num_list[i];
        }

        if(time<add*add)
            return 1;
        else
            return 0;
    }
}