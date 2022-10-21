/* 

1446. Consecutive Characters

The power of the string is the maximum length of a non-empty substring that contains only one unique character.
Given a string s, return the power of s.

Example 1:
Input: s = "leetcode"
Output: 2

Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5

Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

*/

class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 0;
        char prev = ' ';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == prev) {
                count++;
            } else {
                count = 1;
                prev = c;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}