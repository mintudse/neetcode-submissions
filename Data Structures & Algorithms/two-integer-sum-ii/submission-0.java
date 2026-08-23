class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0; // set up pointers
        int r = numbers.length - 1;
        while (l < r){
            int sum = numbers[l] + numbers[r];
            if (sum < target){
                l++;
            }
            else if (sum > target){
                r--;
            }
            else{
                return new int[] {l + 1, r + 1}; // forgot syntax
            }
        }
        return new int[]{l, r};

    }
}
