class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minInd = 0, maxInd= 0;
        for(int i =0;i<n;i++){
            if(nums[i] < nums[minInd]) minInd = i;//getting min
            if(nums[i] > nums[maxInd]) maxInd = i;//getting max
        }
        int left = Math.min(minInd , maxInd);
        int right = Math.max(minInd , maxInd);
        int fromleft = right+1;//delete everything up to right from front
        int fromright = n-left;//delete everything from back upto left  
        int fromboth = (left+1)+(n-right);//delete left+1 from front and n-right from back
        return Math.min(fromleft , Math.min(fromright , fromboth));//math.min works to compare two ele so we do it twice as we have to compare 3 ele 
    }
}