class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    arr[k]=nums1[i];
                    k++;
                    break;
                }
            }
        }
 Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set.add(arr[i]);
        }
        
        int[] result = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }
        
        return result;
    }
}
