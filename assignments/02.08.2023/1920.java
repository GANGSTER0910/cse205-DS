class Solution {
    public int[] buildArray(int[] n) {
        int [] ans = new int[n.length];
        for(int i=0;i<n.length;i++){
            ans[i] = n[n[i]];
            
        } 
        return ans;
    }
}