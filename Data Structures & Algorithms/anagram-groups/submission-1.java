class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String sort = strSort(str);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> anagrams : map.values()){
            result.add(anagrams);
        }
        return result;
    }
    static String strSort(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
