class Solution {
    int[][] dp;
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;

        dp = new int[n][n+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-99);
        }
        

        return lis(nums,0,n,-1);
    }

    int lis(int[] nums,int idx,int n,int preIdx){
        if(idx == n){
            return 0;
        }
        if(dp[idx][preIdx+1] != -99){
            return dp[idx][preIdx+1];
        }
        int notTake = lis(nums,idx+1,n,preIdx);

        int take = 0;
        if(preIdx == -1 || nums[preIdx] < nums[idx]){
            take = 1+lis(nums,idx+1,n,idx);
        }

        return dp[idx][preIdx+1] = Math.max(take,notTake);
    }
}