class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int startidx = 0;
        int maxlen = 1;

        for (int i = 0; i < s.length(); i++) {
            // odd case
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxlen) {
                    maxlen = r - l + 1;
                    startidx = l;
                }
                l--;
                r++;
            }

            // even case
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxlen) {
                    maxlen = r - l + 1;
                    startidx = l;
                }
                l--;
                r++;
            }
        }

        String res = s.substring(startidx, startidx + maxlen);
        return res;
    }
}
