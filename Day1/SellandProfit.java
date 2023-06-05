public class SellandProfit {
    public int maxProfit(int[] prices) {
        int minimal = prices[0];
        int cost= 0, profit= 0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            cost = prices[i]-minimal;
            if(profit<cost){
                profit = cost;
            }
            if(minimal>prices[i]){
                minimal=prices[i];
            }
        }
        return profit;
    }
}