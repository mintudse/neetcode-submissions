/*
- test case:
--> a number with only 0s, return 0
// intToArray()

*/

class Solution{
    public int hammingWeight(int n){
        int result = 0;
        int count = 32;
        while (count > 0){
            if (n % 2 == 1){    //we have 1 at end
                result++;
            }
            n = n/2;
            count--;
        }

        return result;
    }

}



















// class Solution {
//     public int hammingWeight(int n) {
        
//     }
// }
