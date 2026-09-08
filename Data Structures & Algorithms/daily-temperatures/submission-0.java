class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //brute force:
        int[] result = new int[temperatures.length];
        int idx = 0;
        int counter = 0;

        for (int i = 0; i < temperatures.length; i++) {
        for (int j = i+1; j < temperatures.length; j++) {
            if (temperatures[i] < temperatures[j]) {
            counter++;
            result[idx] = counter;
            counter = 0;
            break;
            }
            counter++;
        }
        counter = 0;
        idx++;
        }
        return result;
    }
}
