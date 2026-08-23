/*
Q:
- can we assume array of ints are all positive?
- can assume target and nums not too large, don't worry about overflow?
- what is our output formatted as? and array of ints?
- is the input array sorted?
- can our input array have repeated numbers? -> yes
- only one answer / one possible valid pair? -> yes
- what should we return if can't find an answer/indices? or assume always one?

make sure return smallest index first

Test cases:
- negative numbers in the input [-1, 2, 4, 5], 6
- repeated values [2, 3, 3], 5

brute force: nested for-loop?
- if we find a matching sum, return the indices
O(n^2) - time  O(1) - memory? (keeping track of sums)
- 

TEST:
  0  1  2  3
[-1, 2, 4, 5], 6
indices: [1,2]
2 + 4 = 6 
*/

class Solution{

public int[] twoSum(int[] nums, int target){
    int[] indices = new int[2];

    for(int i = 0; i < nums.length; i++){
        for(int j = i+1; j < nums.length; j++){
            if ((nums[i] + nums[j]) == target){
                indices[0] = i;
                indices[1] = j;
                return indices;
            }

        }
    }
    return indices;
}



}