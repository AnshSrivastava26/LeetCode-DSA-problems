class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        for (int i = 0; i < str.length; i++) {
            String strAtI = str[i];
            String rev = "";
            for (int j = strAtI.length() - 1; j >= 0; j--) {
                rev += strAtI.charAt(j);
            }
            str[i] = rev;
        }
        return String.join(" ", str);
    }
}