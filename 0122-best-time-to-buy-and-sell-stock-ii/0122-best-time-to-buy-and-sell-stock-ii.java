class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i<prices.length; i++)
        {
            int prev = prices[i-1];
            int curr = prices[i];
            if(prev<curr)
            {
                int x = curr - prev;
                profit += x;
            }
        }
        return profit;
    }
}