class Solution {
    public boolean isPalindrome(String s) {
        char[] input = s.toCharArray();
        int i = 0;
        int j = input.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(input[i])) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(input[j])) {
                j--;
                continue;
            }
            input[i] = Character.toLowerCase(input[i]);
            input[j] = Character.toLowerCase(input[j]);
        
            if (input[i] != input[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
