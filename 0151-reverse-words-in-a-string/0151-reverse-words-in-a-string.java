class Solution {
    public String reverseWords(String s) {
        // split by spaces
        String[] str = s.trim().split("\\s+");

        int i = 0, j = str.length - 1;

        // reverse array
        while (i < j) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;

            i++;
            j--;
        }

        // join back into string
        return String.join(" ", str);
    }
}