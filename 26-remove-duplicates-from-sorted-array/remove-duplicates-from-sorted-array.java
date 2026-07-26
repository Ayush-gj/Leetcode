class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int start=0;
        int checker=1;
        while(checker < nums.length){
            if(nums[checker] == nums[checker-1]){
                checker++;
                continue;
            }
            nums[start+1]=nums[checker++];
            start++;
            count++;
        }
        return count;
    }
}