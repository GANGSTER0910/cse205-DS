class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums[nums.length-1];i++){
            if(i==nums[i]){
                continue;
            }
            else{
                return i;
            }
        }
        return i+1;
    }
}