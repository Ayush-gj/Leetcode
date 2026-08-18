class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = nums[nums.length-1];
        for(int i=1;i<=k-1;i++){
            nums[nums.length-1] += 1;
            sum += nums[nums.length-1];
        }
        return sum;
    }
}