class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;// 1 as positive int start with 1 not 0
        int arrIndex = 0;
        int missingcount = 0;
        while(true){
            if(arrIndex < arr.length && arr[arrIndex] == num){
                arrIndex ++;// the no. exists move forward
            }else {
                missingcount ++;
                if(missingcount == k){
                    return num;// index of that missingcount number
                }
            }
            num++;
        }
    }
}