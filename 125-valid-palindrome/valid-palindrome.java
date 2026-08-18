class Solution {

    static boolean palindrome(String s , int left , int right){
        if(left >= right){
            return true;
        }

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }

        return palindrome(s , left + 1 , right - 1);
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        return palindrome(s , 0 , s.length() - 1);
    }
}