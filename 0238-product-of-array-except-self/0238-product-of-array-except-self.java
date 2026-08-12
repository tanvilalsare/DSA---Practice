class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] answer = new int[n];
        int runningleft = 1;
        for(int i = 0;i<n;i++){
            answer[i] = runningleft; // update first 
            runningleft = runningleft * nums[i]; // then multiply so that product of all things before it will be calculated
        }
        int runningright = 1;
        for(int i =n-1;i>=0;i--){
            answer[i] = answer[i] * runningright;//pdt of left and right as asn[i] is pdt of left
            runningright = runningright*nums[i];
        }
        return answer;
    }
}