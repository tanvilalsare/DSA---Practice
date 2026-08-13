class Solution {
    public boolean checkIfExist(int[] arr) {
        Map <Integer, Integer> count = new HashMap<>();//we use map to get the key val pair this is to avoid failling the edge case now eg. 0 now 0 is double only when we have 2 0's but if we use set any num *0 will give use 0 and even if there is only 1 0 we will get ans as true but it should be false instead so thats why we use map.
        for(int i : arr){
            count.put(i, count.getOrDefault(i , 0)+1);//look up i in the map; if it's there, give me its current count; if it's not there yet, give me 0 if its there then also +1
        }
        for(int j : arr){
            int val = j*2;
            if(val ==j){//this happens only when j = 0 so we check if there are 2 0's or 1 
                if(count.get(j)>1){
                    return true;
                }
            }else{
                if(count.containsKey(val)){
                    return true;
                }
            }
        }
        return false;
    }
}