class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i =0;i<n;i++){
            int []row = image[i];
            int left = 0;
            int right = n-1;
            while(left <= right){
                int temp = row[left]^1;
                row[left] = row[right]^1;
                row[right] = temp;
                left++;
                right--;
            }
       }
       return image; 
    }
}