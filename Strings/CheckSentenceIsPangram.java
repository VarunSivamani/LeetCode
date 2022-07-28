/*  

1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"

Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

*/

// Solution 1

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            }
        }

        if (set.size() == 26) {
            return true;
        }
        return false;
    }
}

// Solution 2

class Solution2 {
    public boolean checkIfPangram(String sentence) {
        boolean c[] = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            int k = sentence.charAt(i) - 'a';
            c[k] = true;
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] == false) {
                return false;
            }
        }
        return true;
    }
}