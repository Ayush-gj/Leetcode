class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = n;
        int k = 0;
        while(left<n && right<=2*n){
            if(k%2 == 0){
                ans[k++] = nums[left++];
            }else{
                ans[k++] = nums[right++];
            }
        }
        ans[2*n-1] = nums[2*n-1];
        return ans;
    }
}