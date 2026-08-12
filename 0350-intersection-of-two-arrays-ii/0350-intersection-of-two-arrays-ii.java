class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num , 0) + 1); // creating frequency map 
        }
        List<Integer> resultlist = new ArrayList<>();//we will add all the same ele in this ams we use arraylist cause we dont know the size and arraylist grows dynamicaly it grows as we add
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num)>0){// >0 as we also do the decrement to get all teh values as many times it have ccured so we check for > 0
                resultlist.add(num);
                map.put(num , map.get(num)-1);//decrement .get(num) gets the count of that value .put updates ned decremented value 
            }
        }
        int[] result = new int[resultlist.size()]; // converting arraylist to arr to output the ans 
        for(int i =0;i<result.length;i++){
            result[i] = resultlist.get(i);
        }
        return result;
    }
}