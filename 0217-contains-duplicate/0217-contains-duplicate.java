class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums){
            if(set1.contains(num)){
                return true;/// already seen this number → duplicate found
            }
            set1.add(num);// // otherwise, record it and move on
        }
        return false;
        
    }
}