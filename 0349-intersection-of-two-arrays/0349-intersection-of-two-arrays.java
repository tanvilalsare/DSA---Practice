class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num); // creating the hashset of the elements of the nums1
        }
        Set<Integer> resultSet = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()]; // converting hashset to array 
        int index = 0;
        for(int num : resultSet){
            result[index++] = num;
        }
        return result;
    }
}