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
        minIndex++;
        maxIndex++;

        // if((minIndex <= nums.length/2 && maxIndex <= nums.length/2) || (minIndex >= nums.length/2 && maxIndex >= nums.length/2)){
        //     ans = Math.max(minIndex , maxIndex);
        // }

        int front = Math.max(minIndex , maxIndex);
        int back = Math.max(nums.length - minIndex + 1 , nums.length - maxIndex + 1);
        int mix = Math.min(minIndex + (nums.length - maxIndex + 1) , maxIndex + (nums.length - minIndex + 1));

        return Math.min(front , Math.min(back , mix));
    }
}