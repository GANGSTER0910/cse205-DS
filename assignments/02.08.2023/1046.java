class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> list = new ArrayList();
        for(int i=0;i<stones.length;i++){
            list.add(stones[i]);
        }
        while(list.size()>1){
            int v1 = list.get(list.size()-1);
            int v2 = list.get(list.size()-2);
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            if(v1>v2 || v2>v1){
                list.add(Math.abs(v1-v2));
            }
            Collections.sort(list);}
            if(list.size()==1){
                return list.get(0);
            }
        return 0;
    }
}