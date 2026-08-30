class Solution {
    public int[][] generateMatrix(int n) {
        int [][] result = new int[n][n];// creating an empty matrix with n*n ele
        int top =0, bottom = result.length -1;
        int left = 0, right = result[0].length-1;
        int num=1;//1 as the qns whats us to fill ele from 1 to n^2
        while(top <= bottom && left <= right){
            for(int i = left;i<=right; i++){// fill ele along the top row 
                result[top][i] = num++;// only top elemet will be added col will move and add ele adn row will be constant 
            }
            top++;// move to next row
            for(int j = top; j<= bottom;j++){//moves along rightmost row downwards
                result[j][right] = num++ ;// adding ele to the rightmost row
            }
            right--;
            if(top<=bottom){
                for(int i =right; i>= left;i--){//moving along the bottom right to left 
                    result[bottom][i] = num++;// adding ele to bottom line going right to left
                }
                bottom--;
            }
            if(left<=right){
                for(int j = bottom;j>= top;j--){// moving from bottom to up in left side 
                    result[j][left] = num++;// adding ele to leftmost side going up 
                }
                left++;//shift 1 to left
            }
        }
        return result;

    }
}