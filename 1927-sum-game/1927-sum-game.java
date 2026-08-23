class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftsum =0, leftq=0, rightsum =0, rightq=0;
        for(int i =0;i<n/2;i++){//left half
            if(num.charAt(i)=='?') leftq++;
            else leftsum +=num.charAt(i)-'0';
        }
        for(int i =n/2;i<n;i++){
            if(num.charAt(i)=='?') rightq++;
            else rightsum +=num.charAt(i) - '0';
        }
        int totalq=leftq+rightq;//totsl number of ?
        if(totalq %2!=0) return true; // odd so alice wins
        int diff = leftsum-rightsum;
        int target = 9*(rightq-leftq)/2;
        return diff!= target;//if true then alice win if false then bob
    }
}