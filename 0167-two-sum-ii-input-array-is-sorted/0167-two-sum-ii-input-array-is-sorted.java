class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high= numbers.length-1;
        while(low<=high){
            int sum = numbers[high]+numbers[low];
            if(sum == target){
                return new int[]{low+1,high+1};//+1 as in o/p we want index from 1 not 0
            }else if(sum<target){//we need biger number sum 
                low++;
            }else{
                high--; // sum>target : need smaller number for sum 
            }
        }
        return new int[]{-1,-1};
    }
}
