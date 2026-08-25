class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 2 && s.charAt(0) != s.charAt(1)){
            return 2;
        }
        int finalLength = 1;
        for(int i=0;i<s.length()-1;i++){
            int length = 0;
            Set<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    set.add(s.charAt(j));
                    length++;
                    finalLength = Math.max(length , finalLength);
                }
            }
        }
        return finalLength;
    }
}