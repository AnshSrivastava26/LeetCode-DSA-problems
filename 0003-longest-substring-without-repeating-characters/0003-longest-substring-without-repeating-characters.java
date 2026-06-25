class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int i=0,j=0;
        int cmax = 1;
        HashSet<Character> set = new HashSet<>();

        while(j<s.length()){
            
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            
            set.add(s.charAt(j));
            cmax = Math.max(cmax,j-i+1);

            j++;
        }

        return cmax;
    }
}