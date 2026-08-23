class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ints = new HashSet<>();
        for (int n : nums) {
            if (ints.contains(n)) {
                return true;
            }
            else {
                ints.add(n);
            }
        }
        return false;
    }
}