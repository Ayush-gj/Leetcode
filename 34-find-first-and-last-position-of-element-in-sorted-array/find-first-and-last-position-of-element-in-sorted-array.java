class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccur(nums,target);
        int last=lastOccur(nums,target);
        return new int[]{first,last};
    }

    public int firstOccur(int[] nums,int target){
        int start=0,end=nums.length-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public int lastOccur(int[] nums,int target){
        int start=0,end=nums.length-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}