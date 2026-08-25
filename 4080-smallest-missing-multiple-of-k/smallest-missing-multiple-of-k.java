class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        boolean[] arr = new boolean[nums[nums.length-1] + k + 1];
        for(int i=0;i<nums.length;i++){
            if(nums[i] % k == 0){
                arr[nums[i]] = true;
            }
        }
        int z = k;
        for(int i=0;i<101;i++){
            if(arr[k] == false){
                return k;
            }else{
                k += z;
            }
        }
        return k;
    }
}