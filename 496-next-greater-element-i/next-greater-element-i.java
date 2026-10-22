class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int curr = nums1[i];
            ans[i] = -1;
            for (int j = 0; j < m; j++) {
                if (nums2[j] == curr) {
                    for (int l = j + 1; l < m; l++) {
                        if (nums2[l] > curr) {
                            ans[i] = nums2[l];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return ans;
    }
}