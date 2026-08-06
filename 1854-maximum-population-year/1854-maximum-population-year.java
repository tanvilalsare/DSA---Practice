class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] change = new int[2051];//0 to 2050(its index)
        for(int[] log : logs){
            change[log[0]]++;//birth yr at index 0 hence++
            change[log[1]]--;//death yr at index 1 ence --
        }
        int maxpop =0, maxYear=0 ,currpop=0;
        for(int year =1950;year<=2050;year++){//range given in constrains
            currpop +=change[year];//1,-1 so it will be 0 after eath so 1 is max 
            if(currpop > maxpop){
                maxpop = currpop;
                maxYear = year;// that yar is the maxYear 
            }
        }
        return maxYear;

    }
}