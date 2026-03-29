class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int l=0,r=0;
        while(r<s.length && l<g.length){
            if(s[r] >= g[l]){
                l++;
                r++;
            }else{
                r++;
                continue;
            }
        }

        return l;
    }
}