class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    int k = 0;
                    while(k < n){
                        if(k != i && mat[k][j] == 1){
                            break;
                        }
                        k++;
                    }
                    if(k < n) continue;

                    int l = 0;
                    while(l < m){
                        if(l != j && mat[i][l] == 1){
                            break;
                        }
                        l++;
                    }
                    if(l < m) continue;

                    count++;
                }
            }
        }
        return count;
    }
}
