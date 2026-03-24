class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
                Arrays.fill(dp[i],-1);
        }

        return solve(0,0,m-1,n-1,dp);
    }
    int solve(int cr,int cc,int er,int ec,int[][] dp){
        if(cr == er && cc == ec){
            return 1;
        }
        if(cr > er || cc > ec){
            return 0;
        }
        if(dp[cr][cc] != -1){
            return dp[cr][cc];
        }

        int right = solve(cr+1,cc,er,ec,dp);
        int down = solve(cr,cc+1,er,ec,dp);

        return dp[cr][cc]=(right+down);
    }
}