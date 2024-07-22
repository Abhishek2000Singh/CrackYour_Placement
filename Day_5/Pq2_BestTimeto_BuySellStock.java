public class Pq2_BestTimeto_BuySellStock {
 
        public int maxProfit(int[] prices) {
            int profit = 0;
            int min = Integer.MAX_VALUE;
    
            for(int i =0; i<prices.length;i++){
                int cost = prices[i]-min;
                profit= Math.max(profit, cost);
                min = Math.min(min,prices[i]);
            }
            return profit;
        }
    
    public static void main(String[] args) {
        
    }
}
