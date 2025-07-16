package Day23;

public class MaxProfit {
    /*
     * This method calculates the maximum profit that can be achieved
     * from a list of stock prices given in an array. The algorithm 
     * iterates through the prices, keeping track of the minimum price
     * seen so far and calculating the potential profit for each price.
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // If the current price is lower than the minimum price seen so far,
            // update the minimum price.
            if (price < minPrice) {
                minPrice = price; // update the lowest price so far
            } else {
                int profit = price - minPrice; // profit if sold today
                maxProfit = Math.max(maxProfit, profit); // update the maximum profit if the current profit is greater
            }
        }

        return maxProfit;
    } 
}
