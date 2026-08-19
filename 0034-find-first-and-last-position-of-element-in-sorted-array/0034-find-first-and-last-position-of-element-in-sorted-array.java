class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findbound (nums , target , true);
        int last = findbound (nums , target , false);
        return new int[]{first , last};
    }
    private int findbound (int[] nums , int target , boolean findfirst){
        int low = 0;
        int high = nums.length-1;
        int result = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                result = mid;
                if(findfirst == true){
                    high = mid -1; // if ture start from the leftmost element i.e the first element 
                }else{
                    low = mid+1; // if false start from the rightmost element i.e the last element
                }
            }else if(nums[mid] < target){
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
        return result;
    }
}