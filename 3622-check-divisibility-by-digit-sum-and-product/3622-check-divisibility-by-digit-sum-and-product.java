class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum =0;
        int pdt = 1;
        while(temp>0){
            int digit = temp%10;
            sum +=digit;
            pdt *=digit;
            temp /=10;
        }
        int fin = sum+pdt;
        return n%fin ==0;
    }
}