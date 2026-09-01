class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int minIndex = 0;
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex , maxIndex);
        int right = Math.max(minIndex , maxIndex);

        // if((minIndex <= nums.length/2 && maxIndex <= nums.length/2) || (minIndex >= nums.length/2 && maxIndex >= nums.length/2)){
        //     ans = Math.max(minIndex , maxIndex);
        // }

        int front = right + 1;
        int back = nums.length - left;
        int mix = left + 1 + nums.length - right;

        return Math.min(front , Math.min(back , mix));
    }
}