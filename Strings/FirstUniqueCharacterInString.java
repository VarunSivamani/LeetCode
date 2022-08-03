/* 

387. First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1. 

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

*/

// Solution 1

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return s.indexOf(c);

            }
        }
        return -1;
    }
}

// Solution 2

class Solution2 {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}