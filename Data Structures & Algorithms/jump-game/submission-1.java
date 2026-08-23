/*

*/
class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length <= 0) {
            return true; // ??
        }
        int goal = nums.length-1;   // index
        int curr = nums.length-2;   // index
        for (int i = nums.length-2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        if (goal == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
