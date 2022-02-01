class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min  = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (min + diff < diff) 
                min  = diff;
            else 
                min += diff;
            profit = Math.max(profit, min);
        }
        return profit;
    }
}