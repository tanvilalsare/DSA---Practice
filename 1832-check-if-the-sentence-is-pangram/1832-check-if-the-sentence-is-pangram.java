class Solution {
    public boolean checkIfPangram(String sentence) {
        String lower = sentence.toLowerCase();
        boolean[] seen = new boolean[26];// to alphabet for computer every alphabet is a number 

        for(int i=0;i<lower.length();i++){
            char c = lower.charAt(i);// c repersents the number of the alphabet 
            if(c>='a' && c<='z'){
                int index = c - 'a';// as a=97 and all the other letter follows this i.e 97-97=0=a; 97-96=1=b....
                seen[index] = true;

            }
        }
        for(int j=0;j<26;j++){
            if(!seen[j]){
                return false;
            }
        }
        return true;

    }
}