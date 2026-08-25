class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left =0, right = rows*cols -1;//right is the valid last flaten element i.e in eg1 is 60 
        while(left<=right){
            int mid = left+(right-left)/2;
            int row = mid/cols;//gives the row of the mid
            int col = mid%cols; // gives the col of the mid
            int midval = matrix[row][col];
            if(midval == target){
                return true;
            }else if(midval >= target){
                right= mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}