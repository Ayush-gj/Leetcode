class Solution {
    public int peakValleyDifference(int[] nums) {
        int peaks = 0;
        int valleys = 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                peaks += nums[i];
            }
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] < nums[i - 1] && nums[i] < nums[i + 1]){
                valleys += nums[i];
            }
        }
        return peaks - valleys;
    }
}