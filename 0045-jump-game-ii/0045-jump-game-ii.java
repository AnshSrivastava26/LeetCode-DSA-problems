class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return solve(nums, 0, n,dp);
    }

    public int solve(int[] nums, int idx, int n,int[] dp) {
        if (idx >= n - 1) {
            return 0;
        }

        if(dp[idx] != -1) return dp[idx];
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= nums[idx]; i++) {
            int jumps = solve(nums, idx + i, n,dp);

            if (jumps != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + jumps);
            }
        }

        return dp[idx]= ans;
    }
}