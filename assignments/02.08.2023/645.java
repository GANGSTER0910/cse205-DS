class Solution {
    public int[] findErrorNums(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int dup=0;
       int sum=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                dup=nums[i];
            }
            sum+=nums[i];
            set.add(nums[i]);
        }
        int sum1 = ((nums.length)*(nums.length+1))/2;
        sum = sum1-sum + dup;
        return new int[]{dup,sum};
    }
}