import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
     
        String[] components = path.split("/");
        Stack<String> stack = new Stack<>();
        
        for (String dir : components) {
           
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
      
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
        
                stack.push(dir);
            }
        }
        
        // Reconstruct the canonical path from the stack
        StringBuilder canonicalPath = new StringBuilder();
        for (String dir : stack) {
            canonicalPath.append("/").append(dir);
        }
        
        // If the stack was empty, return "/" (root), otherwise return the built path
        return canonicalPath.length() == 0 ? "/" : canonicalPath.toString();
    }
}