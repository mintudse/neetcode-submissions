// class Solution {
//     public int maxSubArray(int[] nums) {
        
//     }
// }

/*
"sum" = greatest positive value
negative numbers valid
q's: valid inputs (non float)
test case:
- input: empty array, output: output 0
- input: single value, output: itself
- input: pos length array

possibilites:
- sort the array, then find largest sum (towards the end of arr? --> largest unique values):
 ... 3, 4, 4, --> return 4+4 (if more than one of max val, return sum of maxes)
 ...2, 3, 4 --> 
 ... 3, 6 ---> 
 ... -#, pos max (-1, -2, 6) --> return the pos max
 
 CASES:
 - if all positive numbers in the array, return the full array?
- if all negative numbers, return the greatest number (value closest to 0, or =0)
 -3, -2, -1 --> return -1
- if pos and neg:

[2,-3,4,-2,2,1,-1,4]
 ^
  iterate nested for loop
  arraylist that has max sums // might not need, just variable
  ie: max[3] 
   2+ -3 = -1 < 2, so dont add to max. add to running sum
   -1 + 4 = 3 > 2    
   stop loop when end of the array
   return max 

*/

class Solution {
    // [2,-3,|4,-2,2,1,-1,4]
    public int maxSubArray(int[] nums) {
        // maxSub = 8
        int maxSub = nums[0];
        // currSum = 8
        int currSum = 0;
        // 4
        for (int num : nums){
            // 4 < 0
            if (currSum < 0){   //basically if negative currSum, reset because don't consider it
                currSum = 0;
            }
            currSum += num;
            //maxSub = Math.max(maxSub, currSum);
            // 5 < 8
            if (maxSub < currSum){
                maxSub = currSum;
            }
        }
        // 8
        return maxSub;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
// //public int findMaxSubarray (int[] nums){
//     //  0  1 2  3 4 5  6 7
//     // [2,-3,4,-2,2,1,-1,4]
//     if (nums.length == 0){  //check if that checks for empty array
//         return 0;
//     }
//     // count_pos = 2
//     int count_pos = 0;
//     // count_neg = 0
//     int count_neg = 0;
//     List<Integer> maxes = new ArrayList<>();
//     int get_max = 0;
//     // max = 2
//     int max = 0;
//     // i = 0 and < 8
//     for (int i = 0; i < nums.length; i++){
//         // 2 > 0
//         if (nums[i] > 0){ // if positive
//             count_pos += nums[i];
//         }
//         else if(nums[i] < 0){   // if negative
//             count_neg += nums[i];
//         }
//         // running_sum = -1
//         int running_sum = 0;

//         max += nums[i];
//         running_sum += nums[i];
//         // j = 2 < 8
//         for (int j = i+1; j < nums.length; j++){
//             running_sum += nums[j];
//             // -1 > 2
//             if (running_sum > max){
//                 max = running_sum;
//             }
//             if (j == i+1){
//                 if (running_sum > maxes.get(0)){
//                     max = running_sum;
//                     get_max++;
//                 }
//             }
//             if (j == nums.length - 1){
//                 maxes.add(running_sum);
//             }
//         }

//     }
//     if (count_neg == 0){    //never saw negative number
//         return count_pos;
//     }
//     else if (count_pos == 0){   //never saw positive number
//         return count_neg;
//     }
//     return max;
// }
// }