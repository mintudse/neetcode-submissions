class Solution {
    public int maxProfit(int[] prices) {
        // with solution help
        int maxProfit = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxProfit = Math.max(maxProfit, sell - minBuy);
            minBuy = Math.min(minBuy, sell); // oh so even with this becoming 1 in [2,4,1], max profit is updated first and returned only so it's fine
        }


        return maxProfit;
    }
}
