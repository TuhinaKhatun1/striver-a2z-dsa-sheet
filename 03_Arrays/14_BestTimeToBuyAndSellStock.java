/**
 * Problem: Best Time to Buy and Sell Stock
 *
 * You are given an array prices where prices[i] is the price
 * of a stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day
 * to buy one stock and choosing a different day in the future
 * to sell that stock.
 *
 * Return the maximum profit you can achieve.
 *
 * Example:
 * Input: [7,1,5,3,6,4]
 * Output: 5
 *
 * Explanation:
 * Buy on day 2 (price = 1)
 * Sell on day 5 (price = 6)
 * Profit = 6 - 1 = 5
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            minPrice = Math.min(minPrice, price);

            int profit = price - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit = " + maxProfit(prices));
    }
}
