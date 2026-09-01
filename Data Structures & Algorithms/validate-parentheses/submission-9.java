// without a hashmap
class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() == 1) {
            return false;
        }

        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (chars.empty() || chars.peek() != '(') {
                    return false;
                }
                else {
                    chars.pop();
                }
            }
            else if (s.charAt(i) == ']') {
                if (chars.empty() || chars.peek() != '[') {
                    return false;
                }
                else {
                    chars.pop();
                }
            }
            else if (s.charAt(i) == '}') {
                if (chars.empty() || chars.peek() != '{') {
                    return false;
                }
                else {
                    chars.pop();
                }
            }
            else {
                chars.push(s.charAt(i));
            }
        }

        if (chars.empty()){
            return true;
        }
        
        return false;
                
    }
}
