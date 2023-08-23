class Solution {
    public int findNumbers(int[] nums) {
        String count ;
        int ans =0; 
       for(int i=0;i<nums.length;i++){
           count = Integer.toString(nums[i]);
           if((count.length())%2==0){
               ans++;
           }
       }
       return ans ; 
    }
}