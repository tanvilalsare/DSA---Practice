class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int num : nums){
            if(num == first || num == second || num == third){
                continue;//skipping dublicates
            }
            if(num > first){ // this entire blog determine the ranking 
                third = second;
                second = first;
                first = num;
            }else if(num > second){
                third = second;
                second = num;
            }else if( num > third){
                third = num;
            }
        }
        return (third == Long.MIN_VALUE) ? (int) first : (int) third;//// if third was never updated, there's no 3rd distinct max — return the max instead
    }
}