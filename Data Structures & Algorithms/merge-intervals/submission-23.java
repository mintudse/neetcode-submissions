class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1 || intervals == null) {
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] curr = intervals[0];
        result.add(curr); // may be updated, always comparing the most recently added

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (curr[1] >= next[0]) {
                int[] merged = new int[] {curr[0], Math.max(curr[1], next[1])};
                if (merged[1] > curr[1]){
                    result.set(result.size()-1, merged); // update the interval (ie: if [6,7] [6,8], want [6,8])
                    curr = result.get(result.size()-1);
                }
            }
            else {
                result.add(next); // if no overlap
                curr = next;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
