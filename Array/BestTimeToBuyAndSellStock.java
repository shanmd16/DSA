package Array;

public class BestTimeToBuyAndSellStock {
//    public static void main(String[] args) {
//        int [] prices = {7,1,5,3,6,4};
//        int profit =0;
//        int buyPrices = prices[0];
//
//        for(int i=1;i<prices.length;i++){
//            if(buyPrices>prices[i]){
//                buyPrices =prices[i];
//            }
//
//            profit = Math.max(profit,prices[i]-buyPrices);
//        }
//        System.out.println(profit);
//    }
//}

//used function /Method
public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};


    System.out.println(BuyAndSell(prices));
}
    public static int BuyAndSell(int[] prices) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = 0;
        int buyPrices = prices[0];



        for (int i = 1; i < prices.length; i++) {
            if (buyPrices > prices[i]) {
                buyPrices = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrices);
        }
       return profit;
    }
}



