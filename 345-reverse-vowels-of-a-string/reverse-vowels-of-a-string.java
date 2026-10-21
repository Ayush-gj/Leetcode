class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            boolean left = arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                           arr[i] == 'o' || arr[i] == 'u' ||
                           arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' ||
                           arr[i] == 'O' || arr[i] == 'U';

            boolean right = arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' ||
                            arr[j] == 'o' || arr[j] == 'u' ||
                            arr[j] == 'A' || arr[j] == 'E' || arr[j] == 'I' ||
                            arr[j] == 'O' || arr[j] == 'U';

            if (left && right) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (left) {
                j--;
            } else {
                i++;
            }
        }

        return new String(arr);
    }
}
