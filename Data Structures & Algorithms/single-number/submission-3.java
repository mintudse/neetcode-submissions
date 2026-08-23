class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums){
            if (seen.contains(num)){
                seen.remove(num);
            } else{
                seen.add(num);
            }
        }
        return seen.iterator().next();
        // //nums=[3,2,3]
        // if(nums.length == 1){   //only one number
        //     return nums[0];
        // }
        // // 3
        // int toreturn = nums[0];
        // // 4
        // // int prev = toreturn;
        // // [4, 1, 2]
        // Set<Integer> seen = new HashSet<Integer>();
        // HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        // // 3
        // for (int i = 0; i < nums.length; i ++){
        //     if (seen.containsKey(nums[i])){
        //         single.remove(nums[i]);
        //         continue;
        //     }
        //     else{
        //         seen.add(nums[i]);
        //         single.put(nums[i], 1);
        //         // toreturn = nums[i];
        //     }
        // }
        // toreturn = single.();
        // return toreturn;
        // // iterate through the array,
        // // update toreturn to the curr int 
    }
}
