class Solution {
    public int search(int[] nums, int target) {
        int left =0, right = nums.length-1;
        while(left<=right){//left side is sorted ni rotation in left side 
            int mid = left +(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left] <= nums[mid]){//left side is sorted
                if(nums[left]<=target && target<nums[mid]){//so as the left side is sorted so we will check if the target exist in left side now least is nums[left] max in mid so we will search for this range 
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        else{
            if(nums[mid]<target && target<=nums[right]){// right side is sorted so we will check in range of right least is mid and max is nums[right]
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        }
        return -1;
    }
}