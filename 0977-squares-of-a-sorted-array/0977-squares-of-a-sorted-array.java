class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int [] sq = new int[n];
        for(int i =0;i<n;i++){
            sq[i] = nums[i]*nums[i];
        }
        sort(sq);
        return sq;
    }
    static void sort (int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j =1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
