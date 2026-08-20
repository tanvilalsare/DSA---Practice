class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int candidate1 = nums[n-1]*nums[n-2]*nums[n-3]; // multiplying the largest last 3 numbers as its sorted so largest last ele will give the max pdt 
        int candidate2 = nums[0]*nums[1]*nums[n-1];// as its sorted so the first two ele can be -ve so we will get a pdt now in that we will multiply the largest ele thats the last ele ; its ok even if 1 is -ve or no -ve we get max at the end   
        return Math.max(candidate1, candidate2); // get the max 
    }
}