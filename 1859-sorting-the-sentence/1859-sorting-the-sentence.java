class Solution {
    public String sortSentence(String s) {
        String[] words =s.split(" "); // split the sentence into words when we se a " "
        int n = words.length;
        String[] result = new String[n];
        for(String word : words){
            char digit = word.charAt(word.length()-1);//as the last char of every word is the position it should be in so we will just take that position 
            int position = digit - '0'; // converting the char into int we do this by subtracting the char with 0 
            String actualword = word.substring(0, word.length()-1);//getting the atual word that is the entire word except the number so take substring ffrom 0 to n-1
            result[position-1] = actualword;//put the word in its right position and as index starts with 0 so we do -1
        }
        return String.join(" " , result);//join the whole sentence 
    }
}