class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i =1; ; i++){
            int missing = k*i;// for the multiplication 
            if(!set.contains(missing)){
                return missing;
            }
        }
    }
}