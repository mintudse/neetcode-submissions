class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k]; // [ , ]
        HashMap <Integer, Integer> map = new HashMap<>(); // {}
        ArrayList<Integer> uniques = new ArrayList<>(); // []

        for (int n : nums) {
            if (!map.containsKey(n)) { // {1:3, 2:2, 3} [1, 2, 3]
                map.put(n, 1);
                uniques.add(n);
            }
            else {
                map.put(n, map.get(n) + 1);
            }
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        for (int num : uniques) { // [1, 2, 3]
            int freq = map.get(num); // 3
            maxHeap.add(new int[]{num, freq}); //[[1,3], [2,2] [3,1]]
        }  

        for (int i = 0; i < res.length; i++) {
            res[i] = maxHeap.poll()[0]; // gives you the freq
        }
        // [1, 2] <-- i think its the comparator

        return res; //[3,2]

    }
}
