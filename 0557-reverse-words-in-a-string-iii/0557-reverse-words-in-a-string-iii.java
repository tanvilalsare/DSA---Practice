class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");//creating array of string 
        StringBuilder result = new StringBuilder();
        for(int i =0;i<word.length;i++){// as word is a arr od strin so no need of ()
            StringBuilder sb = new StringBuilder(word[i]);//this graps ith word from the array of string and then convert it the the stringbuilder so that we can apply operation on it 
            sb.reverse();
            result.append(sb.toString());
            if(i!=word.length -1){//avoiding extra trailing space at the end 
                result.append(" ");
            }
        }
        return result.toString();
    }
}