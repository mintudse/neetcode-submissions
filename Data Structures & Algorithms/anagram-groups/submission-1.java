class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count); //code basically freq of characters
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s); // add word to the arraylist

        }
        return new ArrayList<>(map.values());


        // Map<List<String>, String> map = new HashMap<>(); 
        // for (String str : strs) {
        //     String[] freq = new String[26];
        //     String word = str;
        //     char[] letters = word.toCharArray;
        //     for (char letter : letters) {
        //         if () // how to know which letter is which number?? in order?? to 26??
        //     }
            
        //     map.push(freq, str);
            
        // }
        // group up the strs by hashmap key matching --> if match key, then put all matching values in sublist
        // build sublists and return it
    }
}
