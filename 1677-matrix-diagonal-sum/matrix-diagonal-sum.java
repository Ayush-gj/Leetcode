class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    sum1 += mat[i][j];
                }
            }
        }
        int k = n-1;
        for(int i=0;i<n;i++){
            sum2 += mat[i][k];
            k--;
        }
        if(n % 2 == 0){
            return sum1 + sum2;
        }
        return sum1 + sum2 - mat[(n-1)/2][(n-1)/2];
    }
}