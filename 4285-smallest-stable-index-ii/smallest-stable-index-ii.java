class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = Math.max(nums[i] , pre[i - 1]);
        }
        int ans = -1;
        int x = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            x = Math.min(x , nums[i]);
            if(pre[i] - x <= k){
                ans = i;
            }
        }
        return ans;
    }
}