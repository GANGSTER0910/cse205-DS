class Solution {
    public int maxProfit(int[] prices) {
        int maxpro = 0;
        int minpro = Integer.MAX_VALUE ;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minpro){
                minpro = prices[i];}
            if(prices[i]-minpro>maxpro){
                    maxpro = prices[i]-minpro;
            }
            }
       return maxpro; }
        
    }
