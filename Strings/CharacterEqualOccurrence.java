/* 

1941. Check if All Characters Have Equal Number of Occurrences

Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Example 1:

Input: s = "abacbc"
Output: true

Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

*/

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.get(s.charAt(0));
        for (Character c : map.keySet()) {
            if (map.get(c) != count) {
                return false;
            }
        }
        return true;
    }
}