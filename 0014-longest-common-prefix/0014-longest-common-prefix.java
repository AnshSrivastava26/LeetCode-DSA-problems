import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        List<Character> lst = new ArrayList<>();

        // first string ke saare chars list me daal do
        for (int i = 0; i < strs[0].length(); i++) {
            lst.add(strs[0].charAt(i));
        }

        // baaki strings ke saath compare karo
        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            // jab tak chars match kar rahe hain tab tak aage badho
            while (j < lst.size() && j < strs[i].length() && lst.get(j) == strs[i].charAt(j)) {
                j++;
            }

            // mismatch ke baad list ko chhota kar do
            while (lst.size() > j) {
                lst.remove(lst.size() - 1);
            }

            // agar prefix khatam ho gaya to seedha ""
            if (lst.size() == 0) {
                return "";
            }
        }

        // list ko string me convert karo
        StringBuilder ans = new StringBuilder();
        for (char ch : lst) {
            ans.append(ch);
        }

        return ans.toString();
    }
}