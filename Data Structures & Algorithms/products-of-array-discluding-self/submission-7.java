class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix suffix solution
        int[] output = new int[nums.length];
        if (nums.length <= 1) {
            return output;
        }
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            // 2 0 2 3
            // 1 2 0 0
            // X
            // i = 3
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        // do one pass in the array left to right, compute prefixes
        //     first elem is empty as 1, but val is next, then increment,
        //     multiply curr * prev.  (not get to last one)
        
        // do second pass, right to left, suffixes
        //     (last elem) is empty as 1, but val is next, then decrement,
        //     multiply curr * next. (not get to last one)
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            // 2 0 2 3
            // 0 6 3 1
            suffix[i] = nums[i + 1] * suffix[i + 1];
        } 
        
        // iterate through array
        //     output[i] is prefix[i] * suffix[i]
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix[i] * suffix[i];
        }

        return output;
        // division solution
        // //[1, 2, 3]
        // // [3, 2, 0]
        // int[] output = new int[nums.length];
        // //division operator way after 1min into sol vid
        // // if input is empty, return empty
        // // or if input contains one elem return empty
        // if (nums.length <= 1) {
        //     return output;
        // }
        // // compute the product, 
        // //     skipping zeros but 
        // //     check number of zeros as well
        // int product = 1; // 6 // 6
        // int numZeros = 0; // 0 // 1
        // for (int n : nums) {
        //     if (n == 0) {
        //         numZeros++;
        //         continue;
        //     }
        //     else {
        //         product *= n;
        //     }
        // }
        // // [0, 0] numzeros = 2
        // // if there are more than one zero, return output with all 0s
        // if (numZeros > 1) { // maybe a java function to do this in one line?
        //     for (int i = 0; i < output.length; i++) {
        //         output[i] = 0;
        //     }
        //     return output;
        // }
       
        // // iterate through nums,
        // for (int i = 0; i < nums.length; i++) {
        //     if (numZeros >= 1 && nums[i] != 0) {
        //         output[i] = 0;
        //     }
        //     else if (numZeros >= 1 && nums[i] == 0) {
        //         output[i] = product;
        //     }
        //     else if (numZeros <= 0) {   // no zeros
        //         output[i] = product / nums[i];
        //     }
        // }
        // // output: [6, 3, 2]
        // // [0, 0, 6]
        //     // check if curr is a zero or not, and if there are zeros total
        //     // if there is a zero in nums, but curr is not zero
        //     //     output[i] to be 0
        //     // if there is a zero in nums, and curr is the zero
        //     //     output[i] will be the product
        
        // return output;



        // int product = 1;
        // int containszero = 0;
        // for (int n : nums) {
        //     if (n == 0) {
        //         containszero++;
        //         continue;
        //     }
        //     product *= n;
        // }
        // boolean seenZero = false;
        // for (int i = 0; i < nums.length; i++) {
        //     if (containszero > 0) {
        //         if (nums[i] == 0 && seenZero == false) {
        //             output[i] = product;
        //             seenZero = true;
        //         }
        //         else {
        //             output[i] = 0;
        //         }
        //     }
        //     else {
        //         output[i] = product / nums[i];
        //     }  
        // }
        // brute force method that took me like 5 mins
        // for (int i = 0; i < nums.length; i++) {
        //     int product = 1;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (j == i) {
        //             continue;
        //         }
        //         product *= nums[j];
        //     }
        //     output[i] = product;
        // }
        // return output;
    }
}  
