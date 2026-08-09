class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rowmin = new int[rows];
        int[] colmax = new int[cols];
        Arrays.fill(rowmin , Integer.MAX_VALUE);// this means the rowmin is the largest num possible so when we compare for the min if will get updated when the ele smaller tha this comes 
        Arrays.fill(colmax, Integer.MIN_VALUE);
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(matrix[i][j] < rowmin[i]){
                    rowmin[i] = matrix[i][j];// smaller ele gets updated 
                }
                if(matrix[i][j]>colmax[j]){
                    colmax[j]=matrix[i][j];
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(matrix[i][j] == rowmin[i] && matrix[i][j] == colmax[j]){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}