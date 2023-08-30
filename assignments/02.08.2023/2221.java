class Solution {
    public int triangularSum(int[] n) {
        int sum=0;
        if(n.length==1){
            return n[0];
        }
        else{
            int[] newnum = new int[n.length-1];
            for(int i=0;i<n.length-1;i++){
                newnum[i] = (n[i]+n[i+1])%10;
            }
            return triangularSum(newnum);
        }
    }
}