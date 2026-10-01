class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length <= 0 && newInterval.length <= 0) {
            return intervals;
        }
        else if (intervals.length <= 0) {
            return new int[][] {newInterval};
        }
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        ArrayList<int[]> output = new ArrayList<>();
      

        if (newEnd < intervals[0][0]) {
            output.add(newInterval);
            for (int[] interval : intervals) {
                output.add(interval);
            } 
            int[][] result = new int[output.size()][];
            for (int i = 0; i < output.size(); i++) {
                result[i] = output.get(i);
            }
            return result;
        }

        else if (newStart > intervals[intervals.length - 1][1]) {
            int[][] result = new int[intervals.length + 1][];
            for (int i = 0; i < result.length - 1; i++) {
                result[i] = intervals[i];
            }
            result[result.length - 1] = newInterval;
            return result;
        }

        // middle cases
        int lastidx = -1;

        for (int i = 0; i < intervals.length; i++) {
            newStart = newInterval[0];
            newEnd = newInterval[1];
            if (newEnd >= intervals[i][0] && newStart <= intervals[i][1]) {
                // they are overlapping, includes even when not fully engulfed
                // merge
                newInterval = new int[]{Math.min(newStart, intervals[i][0]), Math.max(newEnd, intervals[i][1])};
            }
            else { // no overlap
                if (intervals[i][1] < newStart) {
                    // curr interval is before my interval
                    output.add(intervals[i]);
                }
                else if (newEnd < intervals[i][0]) {
                    // curr is After my interval
                    output.add(newInterval);
                    output.add(intervals[i]);
                    lastidx = i;
                    break;
                }
            }

            // int currStart = intervals[i][0];
            // int currEnd = intervals[i][1];

            // if (newStart < currStart) {
            //     for (int j = i; j < intervals.length; j++) {
            //         if (newEnd > currEnd) {
            //             inputIdx = i;
            //         }
            //         else {  // merge
            //             int[] temp = new int[]{newStart, currEnd};
            //         }
            //     }

                // ok figure out a way to check all other intervals nearby to make sure not overlapping, else merge
            
        }
        if (lastidx >= 0) {
            for (int i = lastidx + 1; i < intervals.length; i++) {
                // just copy the rest to output
                output.add(intervals[i]);
            }
        }

        if (output.isEmpty() || newStart > output.get(output.size()-1)[1]) {
            // empty, everything was merged into one interval
            output.add(newInterval);
        }

        // create final output int[][]
        int[][] result = new int[output.size()][];
            for (int i = 0; i < output.size(); i++) {
                result[i] = output.get(i);
            }
            return result;

        // and then create the new output inerval with the newly added interval if we didn't need to merge, since it would change the size plus need to put in ordered place.
    }
}
