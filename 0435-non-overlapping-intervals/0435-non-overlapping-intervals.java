class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return -1;

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        int count = 0;
        int i=0;
        int j=1;

        while(j<intervals.length){
            int[] current_intervals = intervals[i];
            int[] next_intervals = intervals[j];

            int cs=current_intervals[0];
            int ce=current_intervals[1];

            int ns=next_intervals[0];
            int ne=next_intervals[1];

            if(ce<=ns){
                i=j;
                j++;
            }
            else if(ce<=ne){
                j++;
                count++;
            }else if(ce>ne){
                i=j;
                j++;
                count++;
            }
            
        }
        return count;
    }
}