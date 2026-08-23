class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        for (char ch : ss) {
            if (smap.get(ch) == null) {
                smap.put(ch, 1);
            }
            else {
                smap.put(ch, smap.get(ch) + 1);
            }
        }
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (char ch : tt) {
            if (tmap.get(ch) == null) {
                tmap.put(ch, 1);
            }
            else {
                tmap.put(ch, tmap.get(ch) + 1);
            }
        }
        return tmap.equals(smap);

        // for (Map.Entry<Character, Integer> entry : smap.entrySet()) {
        //     if (entry.getValue() != tmap.entrySet().getValue()) {
        //         return false;
        //     }
        // }
        // return true;

        
    }
}
