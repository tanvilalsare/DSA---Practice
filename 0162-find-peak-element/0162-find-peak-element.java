class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            int left = (i==0)? Integer.MIN_VALUE : nums[i-1];//If i == 0, then left = Integer.MIN_VALUE. Otherwise, left = nums[i - 1]
            int right = (i==n-1) ? Integer.MIN_VALUE : nums[i+1];//If i == n-1, then right = Integer.MIN_VALUE. Otherwise, right = nums[i + 1]
            if(nums[i] >left && nums[i] >right){
                return i; // we want the index of the peak value 
            }
        }
        return 0;
    }
}