class Solution {
    public int[] twoSum(int[] nums, int target) {
        //return indices of matched pair
        int[] match = new int[2];
        for (int i = 0; i<nums.length; i++){    //num on right

            for(int j = i+1; j<nums.length; j++){   //num on left
                if(nums[i] + nums[j] == target){
                    match[0] = i;
                    match[1] = j;
                }
            }
        }
        
        return match;
    }
}
