class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int missing=1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==missing){
                missing++;
            }
        }
        return missing;
    }
}