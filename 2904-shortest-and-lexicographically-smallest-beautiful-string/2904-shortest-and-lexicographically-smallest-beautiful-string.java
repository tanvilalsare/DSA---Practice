class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String res = "";//placeholder
        int left = 0;
        int count = 0;
        
        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1') {
                count++;
            }
            
            while (count == k) {
                // shrink from left as much as possible while still having exactly k ones
                while (s.charAt(left) == '0') {
                    left++;
                }
                
                String val = s.substring(left, right + 1);
                
                if (res.isEmpty() 
                    || val.length() < res.length() 
                    || (val.length() == res.length() && val.compareTo(res) < 0)) {
                    res = val;
                }
                
                // move left past this '1' to look for the next valid window
                count--;
                left++;
            }
        }
        
        return res;
    }
}