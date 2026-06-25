class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyer = prices[0];
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]<buyer)
            {
                buyer=prices[i];
            }
            int sub = prices[i]-buyer;
            if(sub>profit)
            {
                profit = sub;
            }
        }
        return profit;
    }
}