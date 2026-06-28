class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        mergeSort(nums,0,n-1);
    }

    static void mergeSort(int[] nums, int left, int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    static void merge(int[] nums,int left, int mid, int right){
        int[] temp=new int[right+1];
        int i=left, j=mid+1,k=0;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=right){
            temp[k++]=nums[j++];
        }
        k=0;
        for(i=left;i<=right;i++){
            nums[i]=temp[k++];
        }
    }
}