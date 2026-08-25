class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for(int i =0;i<s.length();i++){
            result[indices[i]] = s.charAt(i);//take the character at position i in s, and place it directly at position indices[i] in result
        }
        return new String(result);// can't return char so convert it the string 
    }
}