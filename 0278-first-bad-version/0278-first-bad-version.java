/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int bad = 1;
        int notbad = n;
        while(bad<notbad){
            int mid = bad+(notbad-bad)/2;
            boolean result = isBadVersion(mid);
            if(result == true){
            notbad = mid;
            }else{
            bad = mid+1;
        }

        }
        return notbad;
    }
}