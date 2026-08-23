class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int counterpart = target - nums[i];
            if (hashmap.get(counterpart) != null){
                return new int[]{hashmap.get(counterpart), i};
            }
            else{
                hashmap.put(nums[i], i);
            }
        }
        return nums;
    }
}
// example 3, 5, 4, 5 ; target 10
/* 
i = 3, nums[i] = 5
10 - 5 = 5

hashmap:
3, 0
5, 1
6, 2

return [1, 3]

*/

// time: O(n) --> iterate once through n elements
// space: O(n) --> hashmap containing n elements