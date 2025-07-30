package arrays;

public class StockBuySell {
    public static int calculateMaxProfit(int[] array){
        int profit = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i] > array[i-1]) {
                profit += array[i] - array[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(calculateMaxProfit(prices));
    }
}
