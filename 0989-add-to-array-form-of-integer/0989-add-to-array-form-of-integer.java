class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length-1; // to point at the last elemnt as we add from the back 
        int carry =0;
        while(i>=0 || k>0){ // till digits are in bound 
            int sum = carry;
            if(i>=0){
                sum += num[i--];// as we are going back to front
            }
            if(k>0){
                sum+=k%10;// add the digit 
                k/= 10;// revove the digit from the number
            }
            ans.add(sum%10);// to get the carry out 
            carry = sum/10;
        }
        if(carry>0){
            ans.add(carry);// at last if any carry left add that 
        }
        Collections.reverse(ans);// as we are adding from back we get the ans in revers order so reverse it to get the actual ans
        return ans;
    }
}