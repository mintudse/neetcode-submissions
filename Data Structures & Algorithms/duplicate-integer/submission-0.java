/*
- what if, we put all values into a set, and if set
add returns false, then we return false
- brute force: iterate through (O(n^2)) - per 
n element, go thru rest of the array, see if match, if so, false
else, move on to next n element

*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        SortedSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            boolean added = set.add(nums[i]);
            if (added == false){
                return true;
            }
        }
        return false;
    }
}
