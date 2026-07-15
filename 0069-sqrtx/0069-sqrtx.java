class Solution {
    public int mySqrt(int x) {
        int s =0;
        int e = x;
        while(s<=e){
            int mid = s+(e-s)/2;
            long sqr = (long)mid*mid; // to handle larger input 
            if(sqr > x ){
                e=mid-1;
            }else if(sqr <x){
                s = mid+1;
            }else{
                return mid;
            }
        }
        return e; // as this occurs when s>e so we will have e as the right index 
    }
}