class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alti =0;
        int maxal = 0;
        for(int i=0;i<n;i++){
            alti += gain[i];
            if(alti>maxal){
            maxal=alti;
        }
        }
        return maxal;
    }
}