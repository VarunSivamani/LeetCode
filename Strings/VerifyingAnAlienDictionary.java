/*

953. Verifying an Alien Dictionary

In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

Example 1:
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true

Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Example 2:
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false

Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

Example 3:
Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false

Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character.

*/

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] alphabet = new int[26];

        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int min = Math.min(words[i].length(), words[j].length());

                for (int k = 0; k < min; k++) {
                    char iChar = words[i].charAt(k);
                    char jChar = words[j].charAt(k);

                    if (alphabet[iChar - 'a'] < alphabet[jChar - 'a']) {
                        break;
                    } else if (alphabet[iChar - 'a'] > alphabet[jChar - 'a']) {
                        return false;
                    } else if (k == min - 1 && words[i].length() > words[j].length()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}