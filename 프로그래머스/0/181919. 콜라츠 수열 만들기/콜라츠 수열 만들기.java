class Solution {
    public int[] solution(int n) {
        int[] answer={};
        int n2 = n;
        int a = 1;

        while(n!=1){
            if(n==1)
                break;

            if(n%2 == 0){
                n = n/2;
                a++;
            }
            else{
                n = 3*n +1;
                a++;
            }
        }
        answer = new int[a];
        answer[0] = n2;
        a = 1;

        while(n2!=1){
            if(n2==1)
                break;

            if(n2%2 == 0){
                n2 = n2/2;
                answer[a++] = n2;
            }
            else{
                n2= 3*n2 +1;
                answer[a++] = n2;
            }
        }
        return answer;
    }
}