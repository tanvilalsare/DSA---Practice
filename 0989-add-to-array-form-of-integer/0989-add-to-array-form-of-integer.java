class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length-1; // to point at the last elemnt as we add from the back 
        int carry =0;
        while(i>=0 || k>0){
            int sum = carry;;
            if(i>=0){
                sum += num[i--];// as we are going back to front
            }
            if(k>0){
                sum+=k%10;
                k/= 10;
            }
            ans.add(sum%10);// to get the carry out 
            carry = sum/10;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}