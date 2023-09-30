class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max =0;
        for(int i=0;i<accounts.length;i++){
            int n=0;
            for(int j=0;j<accounts[i].length;j++){
                n += accounts[i][j];  
            }
             if(n>max){
                    max = n;
                }
        }
    return max;}
}