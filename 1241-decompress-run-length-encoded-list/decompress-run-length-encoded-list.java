class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        List<Integer> list = new ArrayList<>();

        while(j <= nums.length - 1){
            int count = nums[i];
            while(count != 0){
                list.add(nums[j]);
                count--;
            }
            i += 2;
            j = i + 1;
        }
        int k = 0;
        int[] arr = new int[list.size()];
        for(int z=0;z<arr.length;z++){
            arr[z] = list.get(k++);
        }
        return arr;
    }
}