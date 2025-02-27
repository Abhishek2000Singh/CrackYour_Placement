/**
 * Pq1_BuyAndSellStocks2
 */
public class Pq1_BuyAndSellStocks2 {
    
        public int maxProfit(int[] prices) {
            int max = 0;
            int start = prices[0];
            int len = prices.length;
            for (int i = 1; i < len; i++) {
                if (start < prices[i]) {
                    max += prices[i] - start;
                }
                start = prices[i];
            }
            return max;
        }

    public static void main(String[] args) {
        
    }
}