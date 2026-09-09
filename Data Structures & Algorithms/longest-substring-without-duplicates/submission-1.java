class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>(); // k,v = char, idx
        char[] input = s.toCharArray();
        int left = 0; // left pointer of window
        int res = 0; // track the max length of substring

        for (int i = 0; i < input.length; i++) { // i is the right pointer
            if (map.containsKey(input[i])) { // if duplicate
                //left = map.get(input[i]) - left;
                left = Math.max(left, map.get(input[i]) + 1); // decreases the window, moves left pointer to the right, past the first duplicate.
                // res = res - left;
            }
            map.put(input[i], i); // will replace with the new index if there is a duplicate already
            // res++;
            res = Math.max(res, (i - left) + 1);
            
        }
        return res;
        
    }
}

/*
if empty string, return output of 0
keep a window of the substring (2 pointers)
set to check for duplicates
    if we do find a duplicate, then remove it from the left
    keep track of the max size of the window
return the max size
*/