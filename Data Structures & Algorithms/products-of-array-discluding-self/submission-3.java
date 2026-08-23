class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1, 2, 3]
        // [3, 2, 0]
        int[] output = new int[nums.length];
        //division operator way after 1min into sol vid
        // if input is empty, return empty
        // or if input contains one elem return empty
        if (nums.length <= 1) {
            return output;
        }
        // compute the product, 
        //     skipping zeros but 
        //     check number of zeros as well
        int product = 1; // 6 // 6
        int numZeros = 0; // 0 // 1
        for (int n : nums) {
            if (n == 0) {
                numZeros++;
                continue;
            }
            else {
                product *= n;
            }
        }
        // [0, 0] numzeros = 2
        // if there are more than one zero, return output with all 0s
        if (numZeros > 1) { // maybe a java function to do this in one line?
            for (int i = 0; i < output.length; i++) {
                output[i] = 0;
            }
            return output;
        }
       
        // iterate through nums,
        for (int i = 0; i < nums.length; i++) {
            if (numZeros >= 1 && nums[i] != 0) {
                output[i] = 0;
            }
            else if (numZeros >= 1 && nums[i] == 0) {
                output[i] = product;
            }
            else if (numZeros <= 0) {   // no zeros
                output[i] = product / nums[i];
            }
        }
        // output: [6, 3, 2]
        // [0, 0, 6]
            // check if curr is a zero or not, and if there are zeros total
            // if there is a zero in nums, but curr is not zero
            //     output[i] to be 0
            // if there is a zero in nums, and curr is the zero
            //     output[i] will be the product
        
        return output;

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
