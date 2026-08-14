class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int x=n ;x>=0;x--){//we go from back as we want the largest val satisfying our condition going from front in case of multiple csae satisfaction will give smallest val plus also backwards is faster;; x is just sumber ranging 0 to n so x = 0 as well as x = n 
            int count = 0;
            for(int num : nums){
                if(num >=x){
                    count++;
                }
            }
            if(count==x){
                return x;
            }
        }
        return -1;
    }
}