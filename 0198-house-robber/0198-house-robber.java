class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev1 = 0;// previous hosue prev1 = i-1 where i i the house to rob n we cant rob adj
        int prev2 = 0;//previous to previous house = i -2 as rob curr but can't rob prev 
        for(int i =0;i<n;i++){
            int curr = 0;
            if(prev1>prev2+nums[i]){ // check which gives the max value also prev2+nums[i] as nums[i] is what we will get if we consider that and we will exclude prev1 as no adj house rob togther 
                curr = prev1;
            }else {
                curr = prev2+nums[i];
            }
            prev2 = prev1; // save the OLD prev1 (through i-1) as the new "two back" value, before it's overwritten
            prev1 = curr; // curr (through i) becomes the new "one back" value for the next iteration
        
        }
        return prev1;// after the loop, prev1 holds the best sum through the last house
    }
}