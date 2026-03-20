class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        return sol(n,dp);
    }
    int sol(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0) return dp[n];
        dp[n] = sol(n-1,dp)+sol(n-2,dp);
        return dp[n];
    }
}