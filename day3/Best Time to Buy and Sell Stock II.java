


// Greedy: 모든 상승분 더하기
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        
        for (int i = 0; i < prices.length - 1; i++) {
            // 상승하면 이익 더하기
            if (prices[i+1] > prices[i]) {
                maxprofit += prices[i+1] - prices[i];
            }
        }
        
        return maxprofit;
    }
//내 풀이
	public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while(i < prices.length -1){
            while(i < prices.length - 1 && prices[i] >= prices[i+1]) i++;
            valley = prices[i];
            while(i < prices.length - 1 && prices[i] <= prices[i+1]) i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
