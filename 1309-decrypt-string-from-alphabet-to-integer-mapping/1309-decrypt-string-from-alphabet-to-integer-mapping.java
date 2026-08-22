class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        while(i<n){
            if(i+2 <n && s.charAt(i+2)=='#'){ // we will check if the string is valid for double digit number if n>i+2 then its not a double digi we will treat is single no point in checking ahead but if its double then just check if the i+2 digit is #
                int num = (s.charAt(i)-'0') * 10 +(s.charAt(i+1) - '0');//combining and getthing the number first convert the char to integer by -0 : eg. 1*10+2 = 12 so i.e L
                sb.append((char)('a' + num-1));//geting the char value -1 cause index start with 0 i.e a =0, b=1..
                i+=3;//move to 3 steps ahead as 12# is one cahr and its done : so when num = 1 i.e its should be a so we do 1-1 = 0 so 0 indes = a and so on 
            }else{//when its jut the single digit not double
                int num = s.charAt(i) - '0';//convert the char to int 
                sb.append((char)('a' + num-1));
                i+=1;
            }
        }
        return sb.toString();
    }
}