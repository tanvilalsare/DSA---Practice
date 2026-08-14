class Solution {
    public int arrangeCoins(long n) {
        int row = 1;
        long remaining = n;
        while(remaining>=row){
            remaining-=row;
            row++;
        }
        return row -1; // as the curr row can be half fill n we want full entirely filled row 
    }
}