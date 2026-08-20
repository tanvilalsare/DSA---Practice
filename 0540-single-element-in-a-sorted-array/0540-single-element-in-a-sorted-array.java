class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer , Integer> single = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            single.put(num , single.getOrDefault(num , 0)+1);
        }
        for(Map.Entry<Integer , Integer> entry : single.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}