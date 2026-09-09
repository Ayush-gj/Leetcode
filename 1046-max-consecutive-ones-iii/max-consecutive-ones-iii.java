class Solution {

    // static int find(int[] arr){
    //     int max = -1;
    //     for(int i=0;i<arr.length;i++){
    //         max = Math.max(max , arr[i]);
    //     }
    //     return max;
    // }

    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        int res = 0;
        int[] f = new int[2];

        for(high=0;high<n;high++){
            f[nums[high]]++;

            int len = high - low + 1;
            int diff = f[0];

            while(diff > k){
                f[nums[low]]--;
                low++;
                len = high - low + 1;
                diff = f[0];
            }
            len = high - low + 1;
            res = Math.max(res , len);
        }
        return res;
    }
}