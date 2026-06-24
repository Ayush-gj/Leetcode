import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
           int f=nums[i];
            for(int j=i+1;j<n;j++){
             int   s=nums[j];
                int sum=s+f;
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}