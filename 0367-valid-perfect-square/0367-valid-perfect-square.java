class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 0;
        int e = num;
        while(s<=e){
            int mid = s+(e-s)/2;
            long sq = (long)mid*mid;
            if(sq>num){// sq is big i.e we need smaller range so e = mid-1
                e = mid-1;
            }else if(sq<num){ // sq is smaller i.e we need larger range so s = mid+1
                s = mid+1;
            }else {
                return true;
            }
        }
        return false;

    }
}