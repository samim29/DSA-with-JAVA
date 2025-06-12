import java.util.*;

public class BuyShellStock {
    public static int CalculateMaxProfit(int prices[]){
        int MinBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int MaxSellPrice = prices[i];
            if(MinBuyPrice < MaxSellPrice){
                int profit = MaxSellPrice - MinBuyPrice;
                maxProfit = profit > maxProfit ? profit : maxProfit;
            }else{
                MinBuyPrice = prices[i];
            }

        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is: "+ CalculateMaxProfit(prices));
    }
}