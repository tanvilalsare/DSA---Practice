class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(Arrays.deepEquals(mat, target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }
    private int[][] rotate(int[][]mat){
    int n = mat.length;
    int [][]result = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            result[j][n-1-i] = mat[i][j];
        }
    }
    return result;

    }
}