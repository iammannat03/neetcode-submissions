class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();
            if(buckets[freq]==null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(element);
        }

        int[] res = new int[k];
        int index=0;
        for(int freq = buckets.length - 1; freq>=1 && index<k; freq-- ){
            if(buckets[freq]!=null){
                for(int it : buckets[freq]){
                    res[index++]=it;
                    if(index==k) break;
                }
            }
        }
        return res;
    }
}
