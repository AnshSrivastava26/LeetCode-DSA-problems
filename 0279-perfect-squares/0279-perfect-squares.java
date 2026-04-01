class Solution {
    int[] dp;
    public int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = solve(n);
        return ans;
    }
    int solve(int n){
        if(n==0){
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        int min = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
                
            int res = solve(n-(i*i));
            
            if(res != Integer.MAX_VALUE){
                min = Math.min(min,res+1);
            }
        }

        return dp[n] = min;
    }
}