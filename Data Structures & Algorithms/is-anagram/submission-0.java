class Solution {
    public boolean isAnagram (String s, String t){
        if (s.length() != t.length()){  //different string length
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();  
        // know lengths are the same, so do 1 loop
        for (int i = 0; i < s.length(); i++){   // create hashmaps
            sCount.put(s.charAt(i), 
            sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), 
            tCount.getOrDefault(t.charAt(i), 0) + 1);
        }
        // compare hashmap frequencies - check if hashmaps the same (same chars, freq)
        return sCount.equals(tCount);
        // can do this because order doesn't matter
        
              // traverse through the strings
        // test case empty string?
//          HashMap<Character, Integer> first = new HashMap<>();

//         for (int i = 0; i < s.length(); i++){   //s string
//             if(first.get(s.charAt(i)) == null){ // if character not in the hashmap
//                 first.put(s.charAt(i), 1);
//             }
//             else{   // if character in the hashmap
//                 first.put(s.charAt(i), first.get(s.charAt(i)) + 1);
//             }
//         }
//         //compare hashmaps

//         // could traverse through the hashmaps, check per key, if matching value
//         // lookup character in other hashmap, if not present, return false
//         // if frequency is different, return false,
//         // else, return true

//         //first traversal, for first string
//         // as doing second traversal for second string, check lookup
//         // in the first hashmap, if character present.

//         HashMap<Character, Integer> second = new HashMap<>();

//         for (int i = 0; i < t.length(); i++){   //s string
//             if(second.get(t.charAt(i)) == null){ // if character not in the hashmap
//                 second.put(t.charAt(i), 1);
//                 if (first.get(t.charAt(i)) == null){	// check the character in both hashmaps
//                     return false;
//                 }
//             }
//             else{   // if character in the hashmap
//                 second.put(t.charAt(i), second.get(t.charAt(i)) + 1);
//             }
//             // now that both hashmaps created, check frequencies of both
//         	for (int j = 0; j < first.size(); j++){   // go through one hashmap, check frequencies
//                 if (first.get(t.charAt(i)) != second.get(t.charAt(i))){	// matching //frequencies?
//                 return false;
//                 }
// }	
//             }
//         return true;
       
/* 
s = racecar
t = carrace
first = [’r’,2] [‘a’, 2] [‘c’, 2] [‘e’, 1]

second = [‘c’,1] 

*/
    }
       
}

