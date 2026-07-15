class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = arr.length;
        int max = 0;
        for(int i=0;i<peak;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}