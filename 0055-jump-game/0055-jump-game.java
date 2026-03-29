class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length+1];
        // Arrays.fill(dp,);
        return jump(nums,0,dp);
    }

    public boolean jump(int[] nums,int idx,Boolean[] dp){
        if(idx >= nums.length-1){
            return true;
        }
        if(dp[idx] != null){
            return dp[idx];
        }

        for(int i=1;i<=nums[idx];i++){
            if(jump(nums,idx+i,dp) == true){
                return dp[idx] = true;
            }
        }

        return dp[idx] = false;
    }
}