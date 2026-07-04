// import java.util.*;

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//         Map<String, List<String>> map = new HashMap<>();

//         for (String str : strs) {

//             char[] arr = str.toCharArray();
//             Arrays.sort(arr);

//             String key = new String(arr);

//             map.putIfAbsent(key, new ArrayList<>());
//             map.get(key).add(str);
//         }

//         return new ArrayList<>(map.values());
//     }
// }

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}