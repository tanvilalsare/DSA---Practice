class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;// row
        int m = matrix[0].length; // col [0] cause already there is a row ane we will comsider the 1st row and take its col so 
        int[][] res = new int[m][n];//flip here i.e transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[j][i] = matrix[i][j];//left=right
            }
        }
        return res;
    }
}