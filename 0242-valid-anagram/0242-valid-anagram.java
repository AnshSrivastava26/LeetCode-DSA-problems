class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqArrS = new int[26];
        int[] freqArrT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freqArrS[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freqArrT[ch - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(freqArrS[i] != freqArrT[i]){
                return false;
            }

        }
        return true;
    }
}