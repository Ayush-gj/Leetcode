class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }

        int pos1 = -1;
        int pos2 = -1;
        int count = 0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                
                if(count > 2){
                    return false;
                }

                if(pos1 == -1){
                    pos1 = i;
                }else{
                    pos2 = i;
                }
            }
        }
        
        if(count == 2){
            if(s1.charAt(pos1) == s2.charAt(pos2) && s1.charAt(pos2) == s2.charAt(pos1)){
                return true;
            }
        }
        
        return false;
    }
}