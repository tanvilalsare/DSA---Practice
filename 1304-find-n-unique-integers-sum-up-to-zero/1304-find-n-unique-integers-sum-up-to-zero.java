class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int index =0;
        if(n%2!=0){
            res[index++] =0;
        }
        for(int i =1;index<n;i++){ //  i will start from 1 as we will take i,-i and 0,-0 makes no sence so we start from 1 
            res[index++] = i;
            res[index++] = -i;
        }
        return res;
    }
}