public class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Map<Integer, PriorityQueue<Integer>>> nodes = new TreeMap<>();
        Queue<Pair<TreeNode, Pair<Integer, Integer>>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, new Pair<>(0, 0)));
        
        while (!queue.isEmpty()) {
            Pair<TreeNode, Pair<Integer, Integer>> pair = queue.poll();
            TreeNode node = pair.getKey();
            int x = pair.getValue().getKey();
            int y = pair.getValue().getValue();
            
            if (!nodes.containsKey(x)) {
                nodes.put(x, new TreeMap<>());
            }
            if (!nodes.get(x).containsKey(y)) {
                nodes.get(x).put(y, new PriorityQueue<>());
            }
            nodes.get(x).get(y).offer(node.val);
            
            if (node.left != null) {
                queue.offer(new Pair<>(node.left, new Pair<>(x - 1, y + 1)));
            }
            if (node.right != null) {
                queue.offer(new Pair<>(node.right, new Pair<>(x + 1, y + 1)));
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (Map<Integer, PriorityQueue<Integer>> column : nodes.values()) {
            List<Integer> colValues = new ArrayList<>();
            for (PriorityQueue<Integer> row : column.values()) {
                while (!row.isEmpty()) {
                    colValues.add(row.poll());
                }
            }
            result.add(colValues);
        }
        
        return result;
    }
}