class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int digit = 0;
            while(curr>0){
                curr /= 10;
                digit++;
                }
                if(digit %2 ==0){ 
                    result++ ;
                    }
                }
            return result;
            }
}