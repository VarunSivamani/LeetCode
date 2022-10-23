/* 

1768. Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"

Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"

Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"

Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d

*/

// Solution - 1

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                sb.append(word1.charAt(i++));
            }
            if (j < n) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}

// Solution - 2

class Solution2 {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int pointer1 = 0, pointer2 = 0, resultPointer = 0;

        char[] res = new char[len1 + len2];

        while (pointer1 < len1 || pointer2 < len2) {
            if (pointer1 < len1) {
                res[resultPointer++] = word1.charAt(pointer1++);
            }

            if (pointer2 < len2) {
                res[resultPointer++] = word2.charAt(pointer2++);
            }
        }
        return new String(res);
    }
}