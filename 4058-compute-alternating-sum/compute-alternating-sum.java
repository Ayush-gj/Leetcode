class Solution {
    public int alternatingSum(int[] nums) {
        // int evenSum = 0;
        // int oddSum = 0;
        // for(int i=0;i<nums.length;i+=2){
        //     evenSum += nums[i];
        // }
        // for(int i=1;i<nums.length;i+=2){
        //     oddSum += nums[i];
        // }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans += nums[i];
            }else{
                ans -= nums[i];
            }
        }
        // return evenSum - oddSum;
        return ans;
    }
}