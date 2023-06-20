// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, buy = prices[0];

        for(int sell : prices) {
            if(sell - buy > profit) {
                profit = sell - buy;
            }

            buy = Math.min(buy, sell);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new Solution().maxProfit(prices));
    }
}