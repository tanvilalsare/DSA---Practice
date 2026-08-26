class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);//in-built fnx to ge index of that character from the string by scanning it internally 
        if(ch == -1){
            return word;
        }
        String prefix = word.substring(0 , idx+1);//(start , end) end is not included so we take +1 as if we just take idx it won't be included ; end is exclusive 
        String rest = word.substring(idx+1);//(start to however long the strng is) so ust idx+1 now styart is inclusive  
        StringBuilder sb = new StringBuilder(prefix);
        sb.reverse();//reverse the subestring
        return sb.toString()+ rest;
    }
}