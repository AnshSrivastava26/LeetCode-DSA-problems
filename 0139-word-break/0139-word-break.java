class Solution {
    Map<String,Boolean> dp ;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new HashMap<>();
        return solve(s,wordDict);
    }
    public boolean solve(String s,List<String> w){
        if(s.length() == 0){
            return true;
        }
        if(dp.containsKey(s)) return dp.get(s);
        for(String word : w){
            if(s.startsWith(word)){
                String rem = s.substring(word.length());
                if(solve(rem,w)){
                    dp.put(s,true);
                    return true;
                }
            }
        }
        dp.put(s,false);
        return false;
    }
}