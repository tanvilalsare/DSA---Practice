class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for(int a :aliceSizes) sumA+=a;// summing all the candies of alice
        for(int b :bobSizes) sumB+=b; // summing all the candies of bob;
        int diff = (sumB-sumA)/2; // for the formula where y = x+(sumB-sumA)/2
        Set<Integer> bobset = new HashSet<>(); // add all bob candies in to the set so taht it will be easier to comapre
        for(int b :bobSizes){
            bobset.add(b);
        }
        for(int x:aliceSizes){
            int y = x+ diff; // contition to follow in order to make a fair exchange so that both have equal number of candies 
            if(bobset.contains(y)){ // compare bobset as its a hashset and we can compare it 
                return new int[]{x,y};
            }
        }
        return new int[]{-1,-1}; // return this if falied

    }
}