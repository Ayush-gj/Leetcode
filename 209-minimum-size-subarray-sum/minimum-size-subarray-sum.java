class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0 , high = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        while(high < n){
            sum = sum + nums[high];

            while(sum >= target){ // kaam ho rha jo amazon mein
                int len = high - low + 1;
                res = Math.min(res , len);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        if(res == Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}