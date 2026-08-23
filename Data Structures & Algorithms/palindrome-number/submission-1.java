class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String num = Integer.toString(x); // syntax
        char[] chars = num.toCharArray(); // syntax
        int l = 0;
        int r = chars.length-1;
        if (chars.length == 1) {
            return true;
        }
        while (l < r) {
            if (chars.length % 2 != 0 && chars[l] == chars[r] && r - l == 2) {  // midpoint (odd # digits)
                break;
            }
            else if (chars[l] == chars[r]) {
                l++;
                r--;
                continue;
            }
            else {
                return false;
            }
        }
        return true;


        
    }
}