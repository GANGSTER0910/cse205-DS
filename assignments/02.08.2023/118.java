class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<List<Integer>>();
        t.add(new ArrayList<>());
        t.get(0).add(1);
        for (int i = 1;i<numRows; i++) {
            List<Integer> r = new ArrayList<>();
            List<Integer> prw = t.get(i-1);
            r.add(1);
            for (int j = 1; j < i; j++) {
                r.add(prw.get(j-1) + prw.get(j));
            } 
                r.add(1);
                t.add(r);
        }
        return t;
    }
}