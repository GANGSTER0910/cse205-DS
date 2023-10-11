class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = nums[0], max = min;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[][] map = new int[max - min + 1][2];
        for (int num : nums) {
            map[num - min][0] = num;
            map[num - min][1]++;
        }
        Arrays.sort(map, Comparator.comparingInt((int[] a) -> a[1]).reversed());
        int[] ans = new int[k];
        int i = 0;
        while (i < k) {
            ans[i] = map[i][0];
            i++;
        }
        return ans;
    }
}