class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);

            if (arr1[x] != arr2[y]) return false;

            arr1[x] = i + 1;
            arr2[y] = i + 1;
        }

        return true;
    }
}
