class Solution {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cnt = n;
            int j = 0;
            while (cnt > i) {
                int tempRes =prices[n - j - 1]- prices[i];
                cnt--;
                j++;
                res = Math.max(res, tempRes);
            }
        }
        return res;
    }
}
