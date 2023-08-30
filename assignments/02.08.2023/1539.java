class Solution {
    public int findKthPositive(int[] arr, int k) {
       int s = 0;
        int e = arr.length - 1;
        if(k<=arr[0]-1){
            return k;   
        }
        k -= arr[0] -1;
        for(int j=0;j<arr.length-1;j++){
            int m = arr[j+1]-arr[j]-1;
            if(k <= m){
                return k+arr[j];
            }
            k -= m;
        }
        return k+arr[arr.length-1];
}}