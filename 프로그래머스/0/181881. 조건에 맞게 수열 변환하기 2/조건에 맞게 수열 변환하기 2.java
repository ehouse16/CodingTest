class Solution {
    public int solution(int[] arr) {
       int answer = 0;
        int changecnt = 0;
        do{
            changecnt = 0;
            for (int j = 0; j < arr.length; j++) {
                int value = arr[j];
                if(arr[j]>=50 && arr[j]%2==0){
                    arr[j] = value/2;
                    changecnt++;
                }else if(arr[j]<50 && arr[j]%2==1){
                    arr[j] = value*2+1;
                    changecnt++;
                }
            }
            answer++;

        }while(changecnt!=0);
        return answer-1;
    }
}