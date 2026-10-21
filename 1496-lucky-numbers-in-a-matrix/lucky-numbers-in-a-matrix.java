class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for (int row = 0; row < n; row++) {
            int minCol = 0;

            for (int col = 1; col < m; col++) {
                if (matrix[row][col] < matrix[row][minCol]) {
                    minCol = col;
                }
            }
            int val = matrix[row][minCol];
            boolean lucky = true;
            for (int r = 0; r < n; r++) {
                if (matrix[r][minCol] > val) {
                    lucky = false;
                    break;
                }
            }
            if (lucky == true) {
                list.add(val);
            }
        }

        return list;
    }
}