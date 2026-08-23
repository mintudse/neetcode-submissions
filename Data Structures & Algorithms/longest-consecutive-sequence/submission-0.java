class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 0 || nums == null) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {   // start of seq
                int seq = 1;
                int curr = num;
                while (set.contains(curr + 1)) {    // while it contains next
                    seq++;
                    curr++;
                }
                longest = Math.max(longest, seq);
            }
        }
        return longest;
    }
}
