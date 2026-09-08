class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //stack
        if (temperatures.length == 1) {
            return new int[]{0};
        }
        if (temperatures.length < 1) {
            return new int[0];
        }

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0); //stack is behind the current index

        for (int i = 1; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i); //stack is behind the current index
        }
        
        return result;
    }
}
