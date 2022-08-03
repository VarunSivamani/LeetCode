/* 

242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. 

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

*/

// Solution 1

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s1 = String.valueOf(ch1);
        String s2 = String.valueOf(ch2);

        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }
}

// Solution 2

class Solution2 {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
}
