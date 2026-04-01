class Solution {
    int[] dp ;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp,-2);
        int res = solve(coins,amount);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    int solve(int[] coins,int amount){
       
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount] != -2) return dp[amount];
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = solve(coins,amount-coin);

            if(res != Integer.MAX_VALUE){
                min = Math.min(min,res+1);
            }
        }

        return dp[amount] = min;
    }
}