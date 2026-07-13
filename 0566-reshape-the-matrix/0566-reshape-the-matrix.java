class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n= mat.length;// og row
        int m = mat[0].length;// og col
        if(m*n != r*c){
            return mat;
        }
        int[][] res = new int[r][c];
        for(int i=0;i<m*n;i++){
            res[i/c][i%c] = mat[i/m][i%m];// new flat mat to be created by the og one 
        }
        return res;
    }
}