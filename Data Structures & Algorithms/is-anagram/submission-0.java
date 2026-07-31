class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        if(new String(sArr).equals(new String(tArr))){
            return true;
        }
        return false;
    }
}
