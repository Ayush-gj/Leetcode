class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] total = new int[nums.length];
        int k = 0;
        int l = 0;
        arr1[k++] = nums[0];
        arr2[l++] = nums[1];
        for(int i=2;i<nums.length;i++){
            if(arr1[k - 1] > arr2[l - 1]){
                arr1[k] = nums[i];
                k++;
            }else{
                arr2[l] = nums[i];
                l++;
            }
        }
        int z = 0;
        for(int i=0;i<k;i++){
            total[z] = arr1[i];
            z++;
        }
        for(int i=0;i<l;i++){
            total[z] = arr2[i];
            z++;
        }
        return total;
    }
}