/*
- what if, we put all values into a set, and if set
add returns false, then we return false
- brute force: iterate through (O(n^2)) - per 
n element, go thru rest of the array, see if match, if so, false
else, move on to next n element

*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) == false){
                map.put(nums[i], 1);
            }
            else{ // value is in the map! we did see it
                //map.put(nums[i], map.get(nums[i])+1);
                return true;
            }
        }
        return false;
        // SortedSet<Integer> set = new TreeSet<Integer>();
        // for (int i = 0; i < nums.length; i++){
        //     boolean added = set.add(nums[i]);
        //     if (added == false){
        //         return true;
        //     }
        // }
        // return false;
    }
}
