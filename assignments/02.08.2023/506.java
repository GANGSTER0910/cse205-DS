class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)-> (score[b]-score[a]));
        for(int i=0;i<n;i++){
            q.add(i);
        }
        String [] ans = new String[n];
        int i=1;
        while(!q.isEmpty()){
            int indx = q.poll();
            if(i==1){
                ans[indx] = "Gold Medal";
                i++;
            }
            else if (i==2){
                ans[indx] = "Silver Medal";
                i++;
            }
            else if (i==3){
                ans[indx] = "Bronze Medal";
                i++;
            }
            else ans[indx] = Integer.toString(i++);
        }   
        return ans;
    }
}