class Solution {
    public int bagOfTokensScore(int[] nums, int power) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int maxScore = 0;
        int score= 0;

        while(i<=j){
            if(power >= nums[i]){
                score++;
                power-=nums[i];
                i++;
                maxScore = Math.max(maxScore,score);
            }
            else if(score>=1){
                power+=nums[j];
                score--;
                j--;
            }
            else {
                return maxScore;
            }
        }

        return maxScore;
    }
}