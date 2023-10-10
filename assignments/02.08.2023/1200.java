class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1]-arr[i];
            if(diff<min){
                min = diff;
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                List l1 = Arrays.asList(arr[i-1],arr[i]);
                list.add(l1);
            }
        }
        return list;
    }
}