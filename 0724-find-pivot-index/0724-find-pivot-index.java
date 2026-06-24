class Solution {
    public int pivotIndex(int[] nums) {
        int sumL=0;
        int sumR = 0;
        int totalSum = 0;

        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }


        for(int pi=0;pi<nums.length;pi++){
            if(pi>0){
                sumL += nums[pi-1];
            }
            sumR = totalSum-(sumL+nums[pi]);
            if(sumL == sumR){
                return pi;
            }
        }

        return -1;

    }
}