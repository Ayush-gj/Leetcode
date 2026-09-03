class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zero = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0)
                prod *= nums[i];
            else
                zero++; 
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero > 1) {
                res[i] = 0;
            } else if (zero == 1) {
                res[i] = (nums[i] == 0) ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}