class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] arr = heights.clone();// creates new independed copy of heights 
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != arr[i]) {
                count++;
            }
        }
        return count;
    }
}