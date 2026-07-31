class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());

        arr.sort((a, b) -> b.getValue() - a.getValue());

        int res[] = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i).getKey();
        }
        return res;
    }
}
