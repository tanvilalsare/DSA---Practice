class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int curr =0;
        int sum = n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            curr +=nums[i];   
        }
        int final1 = sum - curr;
        return final1;
    }
}