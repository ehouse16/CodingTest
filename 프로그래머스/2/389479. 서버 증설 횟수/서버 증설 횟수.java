class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int server = 0;
        int[] returnServer = new int[24 + k];
        
        for(int i = 0; i < 24; i++){
            server -= returnServer[i];
            
            int requiredServer = players[i]/m;
            
            if(server < requiredServer){
                int newServer = requiredServer - server;
                server += newServer;
                answer += newServer;
                returnServer[i+k] += newServer;
            }                
        }
        
        return answer;
    }
}