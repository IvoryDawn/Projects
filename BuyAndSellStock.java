public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int n = prices.length;

        int max_Profit = 0;
        int buy = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (prices[i] > buy) {
                int profit = prices[i] - buy;
                max_Profit = Math.max(max_Profit, profit);
            } else {
                buy = prices[i];
            }
        }
        System.out.println(max_Profit);
    }
}