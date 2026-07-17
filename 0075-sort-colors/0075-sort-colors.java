class Solution {
    public void sortColors(int[] nums) {
        int start =0;
        int temp = nums.length-1;
        int r=0,w=1,b=2;
        int i=0;
        while(i<=temp){
            if(nums[i]==r){
                swap(nums,i,start);
                start++;
                i++;
            }else if(nums[i]==b){
                swap(nums,i,temp);
                temp--;
            }else{
                i++;
            }
        }
        
    }
    private void swap(int[]nums , int x , int y){
        int t= nums[x];
        nums[x]=nums[y];
        nums[y]=t;
    }
}
