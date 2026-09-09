class Solution {

    static int find(int[] arr){
        int max = -1;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max , arr[i]);
        }
        return max;
    }

    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low = 0;
        int high = 0;
        int res = Integer.MIN_VALUE;
        int[] f = new int[256];

        for(high=0;high<n;high++){
            f[s.charAt(high)]++; // Sbse pehle store krdo
            int len = high - low + 1;
            int maxCount = find(f);
            int diff = len - maxCount; // Yahi diff hi batayega gap to check k

            while(diff > k){ // jab tak k se bada hai hame chain nhi milega
                f[s.charAt(low)]--;
                low++;  // map nhi liya to map.remove nhi krna pad rha as array mein 0 ho jayega apne aap
                maxCount = find(f);
                len = high - low + 1;
                diff = len - maxCount;
            }
            len = high - low + 1;
            res = Math.max(res , len);
        }
        return res;
    }
}