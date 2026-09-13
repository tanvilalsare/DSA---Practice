class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length -1 ;
        while(left <= right){
            int mid = left +(right - left)/2;
            if(nums[mid] == target) return true;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){// this can happen when al the ele are duplicate nas donly the target is diff so then at that we will just uk move left and right pointer
                left++;
                right--;
            }else if (nums[left] <= nums[mid]){
                if(nums[left] <= target && target <nums[mid]){
                    right = mid -1;
                }else{
                    left = mid+1;
                }
            }else {
                if(nums[mid]<target && target <= nums[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return false ;
    }
}