class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int k=0;k<words.length;k++){
            String word = words[k];
            int i = 0 , j = word.length()-1;
            while(i < j){
                if(word.charAt(i) == word.charAt(j)){
                    i++;
                    j--;
                }else{
                    break;
                }
            }
                if(i >= j) return ans = word;
        }
        return ans;
    }
}