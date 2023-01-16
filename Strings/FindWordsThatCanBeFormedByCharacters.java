/* 

1160. Find Words That Can Be Formed by Characters

You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once).
Return the sum of lengths of all good strings in words.

Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6

Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10

Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.

*/

class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] char_counts = new int[26];

        for (char c : chars.toCharArray()) {
            char_counts[c - 'a']++;
        }

        for (String word : words) {
            int[] temp_char_counts = Arrays.copyOf(char_counts, char_counts.length);
            int valid_char_count = 0;

            for (char c : word.toCharArray()) {
                if (temp_char_counts[c - 'a'] > 0) {
                    valid_char_count++;
                    temp_char_counts[c - 'a']--;
                }
            }

            if (valid_char_count == word.length()) {
                sum += word.length();
            }
        }

        return sum;
    }
}