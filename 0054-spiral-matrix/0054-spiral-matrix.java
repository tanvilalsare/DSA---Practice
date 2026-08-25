class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;
        int top = 0, bottom = matrix.length -1;//the top and botton row
        int left = 0, right = matrix[0].length-1;//the left and rightmost i.e first and last col of that row
        while(top <=bottom && left <= right){
            for(int j = left;j<=right;j++){ // adding the top row's all the ele along the col i.e 1,2,3
                result.add(matrix[top][j]);
            }
            top++; // boundry updatep
            for(int i =top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <=bottom){ // check if anty row is remaining 
                for(int i =right;i>=left;i--){
                    result.add(matrix[bottom][i]);//9->8->7
                }
                bottom--;
            }
            if(left<=right){
                for(int j = bottom;j>=top;j--){
                    result.add(matrix[j][left]);//7->4
                }
                left++;
            }
        }
        return result;
    }
}