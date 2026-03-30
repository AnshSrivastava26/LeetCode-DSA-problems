class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                for(int j=0;j<n;j++){
                    if(nums[j] == 2){
                        res = Math.min(res,Math.abs(i-j));
                    }
                }
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}