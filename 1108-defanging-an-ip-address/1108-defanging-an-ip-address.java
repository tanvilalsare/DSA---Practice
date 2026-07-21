class Solution {
    public String defangIPaddr(String address) {
        String def = address.replace("." , "[.]");
        return def;
    }
}