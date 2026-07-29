class Solution {
    public int maximumWealth(int[][] accounts) {
         int b=0;
        for(int i = 0; i < accounts.length; i++){
            int a=0;
            for(int j = 0; j < accounts[i].length; j++){
                a = a + accounts[i][j];
            }
            if(a>b){
                b=a;
            }
            
        }
        return b;
    }
}