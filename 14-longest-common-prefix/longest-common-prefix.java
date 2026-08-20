class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];

        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            int j = 0;
            for(int k=0;k<ans.length() && k<word.length();k++){
                if(ans.charAt(k) == word.charAt(k)){
                    j++;
                }else{
                    break;
                }
            }
            ans = ans.substring(0 , j);
            if(ans.isEmpty()) break;
        }
        return ans;
    }
}