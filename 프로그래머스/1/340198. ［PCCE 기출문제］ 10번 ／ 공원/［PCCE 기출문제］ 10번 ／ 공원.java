import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        Arrays.sort(mats);
        
        for(int i = mats.length-1; i >= 0; i--){
            int n = mats[i];
            
            for(int a = 0; a <= park.length - n; a++){
                for(int b = 0; b <= park[0].length - n; b++){
                    
                    boolean flag = false;
                    
                    label: for(int c = a; c < a+n; c++){
                        for(int d = b; d < b+n; d++){
                            if(!park[c][d].equals("-1")){
                                flag = true;
                                break label;
                            }
                        }
                    }
                    
                    if(!flag){
                        answer = n;
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}