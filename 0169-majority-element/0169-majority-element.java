class Solution {
    public int majorityElement(int[] nums) {
        int c = nums[0];
        int count = 0;
        for(int num:nums){
            if(count ==0){
                c = num;
            }
            count += num == c ?1 : -1;//condition ? valueIfTrue : valueIfFalse
        }
        return c;
    }
}