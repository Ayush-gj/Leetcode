class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int best = nums[0];

        for(int i=1;i<nums.length;i++){
            int val1 = best + nums[i];
            int val2 = nums[i];

            best = Math.max(val1 , val2);
            ans = Math.max(ans , best);
        }
        return ans;
    }
}