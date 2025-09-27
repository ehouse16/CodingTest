class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        
        int sec = 0;
        
        int attackIndex = 0;
        
        int lastAttackTime = attacks[attacks.length -1][0];
        
        for(int i = 1; i <= lastAttackTime; i++){
            if(i == attacks[attackIndex][0]){
                health -= attacks[attackIndex][1];
                sec = 0;
            
            
            attackIndex++;
            
            if(health <= 0)
                return -1;
            }
            else{
                health += bandage[1];
                sec++;

                if(sec == bandage[0]){
                    health += bandage[2];
                    sec = 0;
                }

                if(health > maxHealth)
                    health = maxHealth;
            }
        }
        return health;
    }
}