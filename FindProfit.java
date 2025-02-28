public class FindProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(" Max profit: " + findMaxProfit(prices));
        System.out.println(" Max profit with multiple buy-sell times: " + findMaxProfitMultiple(prices));
    }

    //Find max profit with multiple buy-sell
    //Recursion function
    public static int maxProfitRecusion(int[] prices, int start, int end) {
        int maxProfit = 0;
        for( int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++ ) {
                if (prices[j] > prices[i]) {
                    int currentProfit = prices[j] - prices[i];
                    currentProfit += maxProfitRecusion(prices, start, i - 1) + maxProfitRecusion(prices, j + 1, end);
                    if(currentProfit > maxProfit) {
                        maxProfit = currentProfit;
                    }

                }
            }
        }

        return maxProfit;
    }

    //Return max profit with multiple buy sell
    public static int findMaxProfitMultiple(int[] prices) {
        return maxProfitRecusion(prices, 0, prices.length - 1);
    }

    //Find max profit with one buy-sell
    public static int findMaxProfit(int[] prices) {
        int minBuyPrice = prices[0], profit = 0;
        for(int i = 0; i < prices.length - 1; i++) {

            if(prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            }

            if(profit < prices[i] - minBuyPrice) {
                profit = prices[i] - minBuyPrice;
            }
        }

        return profit;
    }
}
