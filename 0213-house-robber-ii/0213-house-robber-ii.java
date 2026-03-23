class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dp1 = new int[nums.length+1];
        int[] dp2 = new int[nums.length+1];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int case1 = solve(nums,dp1,0,n-2);
        int case2 = solve(nums,dp2,1,n-1);

        return Math.max(case1,case2);

    }
    int solve(int[] nums,int[] dp,int idx,int end){
        if(idx > end) return 0;

        if(dp[idx] != -1) return dp[idx];

        int take = nums[idx]+solve(nums,dp,idx+2,end);
        int skip = solve(nums,dp,idx+1,end);

        return dp[idx] = Math.max(take,skip);
    }
}