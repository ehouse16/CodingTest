class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        int cnt = 0;

        for(int i = l; i<=r; i++){
            String str = Integer.toString(i);
            if(str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9") )
                continue;
            else
                cnt++;
        }


        answer = new int[cnt];

        cnt = 0;

        for(int i = l; i<=r; i++){
            String str = Integer.toString(i);
            if(str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9") )
                continue;
            else
                answer[cnt++] = i;
        }


        if(cnt==0){
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}