class Solution {
    public int findMaxConsecutiveOnes(int[] n) {
        int count =0;
        int maxcount=0;
        for(int i=0;i<n.length;i++){
            
                if(n[i]==1){
                count++;}
                else{
                  maxcount = Math.max(maxcount,count);
                  count =0;  
                }
            }
    return Math.max(maxcount,count);
        }
    
}