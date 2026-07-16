class Solution {
    public int maxProfit(int[] prices) {
   int minimumprice=Integer.MAX_VALUE;
   int maxProfit=0;
   for(int i=0;i<prices.length;i++){
      minimumprice=Math.min(minimumprice,prices[i]);
      int profit=prices[i]-minimumprice;
      maxProfit=Math.max(maxProfit,profit);
   }


return maxProfit;









    }
}
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for(int i=0;i<prices.length;i++){
//             if(buyPrice < prices[i]){
//                    int  profit= prices[i]-buyPrice;
//                    maxProfit = Math.max(maxProfit,profit);
//             }else{
//                 buyPrice =prices[i];
//             }
           
//         }
//         return maxProfit;
//     }
// }