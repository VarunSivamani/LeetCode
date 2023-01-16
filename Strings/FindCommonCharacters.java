/* 

1002. Find Common Characters

Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

Example 1:
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]

*/

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> common_chars = new ArrayList<>();
        int[] min_freq = new int[26];

        Arrays.fill(min_freq, Integer.MAX_VALUE);

        for (String curr : words) {
            int[] char_freq = new int[26];

            for (char c : curr.toCharArray()) {
                char_freq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                min_freq[i] = Math.min(min_freq[i], char_freq[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (min_freq[i] > 0) {
                common_chars.add("" + (char) (i + 'a'));
                min_freq[i]--;
            }
        }
        return common_chars;
    }
}