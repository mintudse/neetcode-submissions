class Solution {
    public int[] countBits(int n) {
        // how do you count bits?
        // for every number from 0 to n 
        int[] output = new int[n+1];
        for (int i = 0; i <= n; i++) {
            String bit = Integer.toBinaryString(i);
            char[] bits = bit.toCharArray();
            for (char b : bits) {
                if (b == '1') {
                    output[i]++;
                }
            }
            //count number of 1s in binary rep of i
        }
        return output;
        
    }
}

// input int n
// output array output
// output is int[] ?
// ie: [0 , 5] --> number of 1's total in all numbers in this range
// [0,0]
// [0,1]
// [0,2]
// no negatives?

// size of output = num of numbers in range incl 0