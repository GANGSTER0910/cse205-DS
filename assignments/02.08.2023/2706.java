class Solution {
    public int buyChoco(int[] prices, int money) {
        int sum=0;
       Arrays.sort(prices);
        for(int i=1;i<prices.length;i++){
            sum = prices[i]+prices[i-1];
            if(sum<=money){
                return money-sum;
            }
        }
        return money;
    }
}