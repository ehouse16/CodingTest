class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int idx = 0;

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if(n==1){
            answer = new int[1+b];
            for(int i = 0; i<=b;i++){
                answer[i] = num_list[i];
            }
        }

        else if(n == 2){
            answer = new int[num_list.length-a];
            for (int i = a; i <=num_list.length-1 ; i++) {
                answer[idx++] = num_list[i];
            }
        }

        else if(n == 3){
            answer = new int[(b-a)+1];
            for (int i = a; i <=b ; i++) {
                answer[idx++] = num_list[i];
            }
        }

        else if(n==4){
            answer = new int[((b-a)/c)+1];
            for (int i = a; i <= b; i=i+c){
                answer[idx++] = num_list[i];
            }
        }
        return answer;
    }
}