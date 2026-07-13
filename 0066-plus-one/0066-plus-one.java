class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;// when i=9 let n-1 be =0 as 9+1=10 n we wont be able to store 10 in one slot 
        }
        int[] res= new int[n+1];//making a new array of n+1 size 
        res[0] = 1;// when we make a new array it get initiallise as 0 for all slots so we will assign ind 0 = 1; 999+1= 1000
        return res;
    }
    
}