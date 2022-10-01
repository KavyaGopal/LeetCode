class Solution {
    public int maxProfit(int[] prices) {
        int output = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i-1] > 0)
                output += prices[i] - prices[i-1];
        }
        return output;        
    }
}