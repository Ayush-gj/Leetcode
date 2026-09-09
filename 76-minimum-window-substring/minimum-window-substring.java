class Solution {

    static boolean sahi(int[] have , int[] need){
        for(int i=0;i<256;i++){
            if(have[i] < need[i]){
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }

        if(t.length() == 0 || s.length() == 0){
            return "";
        }
        int n = s.length();
        int m = t.length();
        int high = 0;
        int low = 0;
        int res = Integer.MAX_VALUE;
        int start = -1;
        int[] need = new int[256];
        int[] have = new int[256];

        for (int i = 0; i < m; i++) {
            need[t.charAt(i)]++;
        }

        for(high=0;high<n;high++){
            have[s.charAt(high)]++;

            while(sahi(have , need)){
                int len = high - low + 1;
                if(res > len){
                    res = len;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        if(res == Integer.MAX_VALUE) return "";
        return s.substring(start , start + res);
    }
}