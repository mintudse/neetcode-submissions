class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) {
            return nums;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) { // {2, j}
                res.add(map.get(nums[i]));
                res.add(i);
                break;
            } 
            else {
                map.put(target - nums[i], i);
            }
        }

        int[] ret = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ret[i] = res.get(i);
        }
        Arrays.sort(ret);

        return ret;
    
    }
}


/* 
input: int[] nums, int target
return: int[] i,j indices, smaller index first. where i != j (can't add same index again), nums at i + nums at j == target. So the indices of the two values that add to target.

nums is not assumed to be sorted.
ie: [4,5,2,5], 6, returns [0, 2]


brute force O(n^2):
3,4; 3,5; 3,6
4,5;4,6
5,6

hashmap approach:
put [index, counterpart value] as hashmap entry.
index of current value, target-currvalue
Then check if current value == a value in the hashmap. if so, use current index and the key of that entry.

compare max value and return smaller index first

*/