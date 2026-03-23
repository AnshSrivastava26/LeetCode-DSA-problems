class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        Long[][] dp = new Long[n][2];  // fixed
        return solve(nums, 0, 1, n, dp);  // start with + sign
    }

    public long solve(int[] nums, int idx, int flag, int n, Long[][] dp) {
        if (idx >= n) {
            return 0;
        }

        if (dp[idx][flag] != null) return dp[idx][flag];

        long skip = solve(nums, idx + 1, flag, n, dp);

        long val = nums[idx];
        if (flag == 0) {
            val = -val;
        }

        long take = solve(nums, idx + 1, 1 - flag, n, dp) + val;

        return dp[idx][flag] = Math.max(take, skip);
    }
}