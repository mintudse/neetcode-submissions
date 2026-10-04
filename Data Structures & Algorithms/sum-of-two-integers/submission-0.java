class Solution {
    public int getSum(int a, int b) {
        // do XOR and handle carry in a loop
        while (b != 0) {
            int temp = (a & b) << 1; // the carry with original a
            a = a ^ b; // XOR
            b = temp; // b is the carry
        } // continues until we don't have a carry

        return a;


    }
}
