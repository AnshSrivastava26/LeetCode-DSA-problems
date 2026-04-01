class Solution {
    int[] dp; 
    public int numDecodings(String s) {
        int n = s.length();
        dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return solve(s, n, 0);
    }

    public int solve(String s, int n, int i) {
        if(dp[i] != -1) return dp[i];
        if (i == n) {
            return dp[i] = 1;
        }

        if (s.charAt(i) == '0') {
            return dp[i] = 0;
        }

        int res = solve(s, n, i + 1);

        if (i + 1 < n) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                res += solve(s, n, i + 2);
            }
        }

        return dp[i] = res;
    }
}