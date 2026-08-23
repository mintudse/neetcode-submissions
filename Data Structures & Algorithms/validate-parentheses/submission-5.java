class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return false;
        }
        char[] input = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length; i++) {
            // open parentheses
            if ( input[i] == '(' || input[i] == '[' || 
            input[i] == '{' ) { 
                stack.push(input[i]);
            }

            // closed parentheses
            if (input[i] == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
                continue;
            } else if (input[i] == ')' && stack.empty()){
                return false;
            } else if (input[i] == ')' && stack.peek() != '(') {
                return false;
            }

            if (input[i] == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
                continue;
            } else if (input[i] == ']' && stack.empty()){
                return false;
            } else if (input[i] == ']' && stack.peek() != '[') {
                return false;
            }

            if (input[i] == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
                continue;
            } else if (input[i] == '}' && stack.empty()){
                return false;
            } else if (input[i] == '}' && stack.peek() != '{') {
                return false;
            }
        }
        // edge case: ]]] or [ 
        if (stack.empty()){
            return true;
        }
        return false;

    }
}