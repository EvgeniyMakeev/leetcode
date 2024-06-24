public static void main(String[] args) {
    int[] prices = {1, 2};
    System.out.println(maxProfit(prices));
}

public static int maxProfit(int[] prices) {
    int max = 0;
    int indexBuy = 0;
    int buy = prices[indexBuy];
    for (int i = 1; i < prices.length; i++) {
        if (max < prices[i] - buy) {
            max = prices[i] - buy;
        } else {
            indexBuy = i;
            buy = prices[indexBuy];
        }
    }
    return max == 0 ? max : indexBuy;
}
