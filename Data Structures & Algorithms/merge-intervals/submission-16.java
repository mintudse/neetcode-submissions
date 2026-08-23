class Solution {
    public int[][] merge(int[][] intervals) {
        // with solution:

        // sort the array first by first elements
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        output.add(intervals[0]); // [0, 1]

        for (int[] interval : intervals) {
            int start = interval[0]; //first position of inner array
            int end = interval[1];
            int lastEnd = output.get(output.size() - 1)[1]; // get the last interval's (most recent) end number

            if (start <= lastEnd) { // [1, 2] [2, 4] 1 <= 4 ||  [0, 1] [1, 4]
                // the output interval's last end is whatever is larger end
                output.get(output.size() - 1)[1] = Math.max(lastEnd, end);
                // this way, since sorted, smallest left point is kept, only the right end is updated if needed)

            } else { // ie new start (3) is greater than last end (1), so no overlap
                output.add(new int[]{start, end}); // no overlap [0,1] [3, 5]
            }
        }
        return output.toArray(new int[output.size()][]);
        
        
        
        
        
        // if (intervals.length <= 0) {
        //     return intervals;
        // }
        // if (intervals.length == 1) {
        //     return intervals;
        // }
        // Map<Integer, List<Integer>> map = new HashMap<>();
        // for (int i = 0; i < intervals.length; i++) {
        //     int[] currInterval = intervals[i]; // [4,5]
        //     int left = intervals[i][0]; // 4
        //     int right = intervals[i][1]; // 5
        //     if (map.containsKey(left)) {    // [2,5]
        //         // compare the item in the map and the curr interval
        //         // add in new merged interval to hashmap
        //         int[] prevInterval = intervals[map.get(left).get(0)]; // [2,3]
        //         int newRight = Math.max(right, prevInterval[1]); // (5,3)
        //         int newLeft = Math.min(right, prevInterval[1]);
        //         int[] newInterval = new int[]{newLeft, newRight};

        //         map.remove(left);
        //         List<Integer> tmpleft = new ArrayList<>();
        //         tmpleft.add(i, 0);
        //         List<Integer> tmpright = new ArrayList<>();
        //         tmpright.add(i, 1);
        //         map.put(newLeft, tmpleft);
        //         map.put(newRight, tmpright);
        //         // ok so the problem is how to add this new merged... can't create new location in hashmap bc no position in intervals[]...
        //         // idea was to replace old interval w new merged. but also don't know how to know what is not overlapping (not touched?)
        //         // call in for help now. spent 46 mins
                


        //     }
        //     // [2, 1] vs [0, 2]
        //     else if (map.containsValue(left)) {

            
        //     }
        //     else if (map.containsKey(right)) {  // [1, 2]
        //         // compare item in the map and curr interval
        //         // add in new merged interval to hashmap   // [2, 3]

        //     }
        //     // [1, 2] vs [0, 2]
        //     else if (map.containsValue(right)) {

        //     }


        //     else if (!map.containsKey(left)){
        //         // values not in hashmap -- add to hashmap
        //         map.put(left, new int[]{i, 0});
                
        //     }
        //     else if (!map.containsKey(right)){
        //         // values not in hashmap -- add to hashmap
        //         map.put(right, new int[]{i, 1});
                
        //     }
        //     // note which intervals not overlapping (if not visited for overlapping)
        //     // return merged intervals
            
        // }
        
    }
}
