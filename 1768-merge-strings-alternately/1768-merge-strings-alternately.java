class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder();//StringBuilder is mutable
        int maxlen = Math.max(n1 , n2);
        for(int i =0;i<maxlen;i++){
            if(i<n1) sb.append(word1.charAt(i));//as index i string from 0
            if(i<n2) sb.append(word2.charAt(i));
        }
        return sb.toString();//we can't return stringbuilder so we convert it to string
    }
}