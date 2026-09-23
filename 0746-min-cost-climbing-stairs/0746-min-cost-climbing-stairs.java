class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return minCost(cost,n,dp);
    }

    int minCost(int[] cost,int n,int[] dp){
        if(n<=1) return 0;
        if(dp[n] != -1) return dp[n];

        return dp[n] = Math.min((minCost(cost,n-1,dp)+cost[n-1]),(minCost(cost,n-2,dp)+cost[n-2]));
    }
}