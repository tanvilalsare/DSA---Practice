class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = " "; // when ever see a  space add it 
        String s2 = " "; //  when ever see a space add it 
        for(String w1 : word1){
            s1 = s1.concat(w1);
        }
        for(String w2 : word2){
            s2 = s2.concat(w2);
        }
        return s1.equals(s2); // check if its equal 
    }
}