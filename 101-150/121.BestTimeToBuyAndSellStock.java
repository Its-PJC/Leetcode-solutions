class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPoint = prices[0];

        for(int i=0;i<prices.length;i++){
            minPoint = Math.min(minPoint,prices[i]);
            profit = Math.max(profit,prices[i]-minPoint);
        }
        return profit;
    }
}