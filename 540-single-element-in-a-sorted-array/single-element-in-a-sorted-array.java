class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = nums[nums.length-1];
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i] != nums[i+1]){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}