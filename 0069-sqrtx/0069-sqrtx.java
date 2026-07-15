class Solution {
    public int mySqrt(int x) {
        int s =0;
        int e = x;
        while(s<=e){
            int mid = s+(e-s)/2;
            long sqr = (long)mid*mid;
            if(sqr > x ){
                e=mid-1;
            }else if(sqr <x){
                s = mid+1;
            }else{
                return mid;
            }
        }
        return e;
    }
}