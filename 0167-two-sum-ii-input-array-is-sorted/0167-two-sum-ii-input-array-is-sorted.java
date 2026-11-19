class Solution {
    public int[] twoSum(int[] n, int t) {
        int i=0,j=n.length-1;
        int[] ans = {-1,-1};

        while(i<=j){

            if(n[i]+n[j] == t){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }

            if(n[i]+n[j] > t){
                j--;
            }
            else{
                i++;
            }

        }

        return ans;
    }
}