class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int min = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            int val1 = nums[i];
            int val2 = min * nums[i];
            int val3 = max * nums[i];

            max = Math.max(val1 , Math.max(val2 , val3));
            min = Math.min(val1 , Math.min(val2 , val3));
            ans = Math.max(ans , Math.max(max , min));
        }
        return ans;
    }
}