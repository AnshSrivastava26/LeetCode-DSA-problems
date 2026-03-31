class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][0];

        int[][] res = new int[intervals.length][2];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // int count = 0;
        int i = 0;
        int j = 1;
        int k = 0;
        while (j < intervals.length) {
            int[] current_intervals = intervals[i];
            int[] next_intervals = intervals[j];

            int cs = current_intervals[0];
            int ce = current_intervals[1];

            int ns = next_intervals[0];
            int ne = next_intervals[1];

            if (ce < ns) {
                // write code to store in res 
                res[k][0] = cs;
                res[k][1] = ce;
                k++;
                i = j;
                j++;
            } else if (ce <= ne) {
                intervals[i][1] = ne;
                j++;
                // count++;
            } else if (ce > ne) {
                // i = j;
                j++;
                // count++;
            }
        }
        res[k][0] = intervals[i][0];
        res[k][1] = intervals[i][1];
        k++;
        return Arrays.copyOf(res, k);
    }
}