class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}