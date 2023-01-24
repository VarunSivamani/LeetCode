/* 

2506. Count Pairs Of Similar Strings

You are given a 0-indexed string array words.
Two strings are similar if they consist of the same characters.

For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.

Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] and words[j] are similar.

Example 1:
Input: words = ["aba","aabb","abcd","bac","aabc"]
Output: 2

Explanation: There are 2 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. 
- i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'. 

Example 2:
Input: words = ["aabb","ab","ba"]
Output: 3

Explanation: There are 3 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. 
- i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.
- i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b'.

Example 3:
Input: words = ["nba","cba","dba"]
Output: 0

Explanation: Since there does not exist any pair that satisfies the conditions, we return 0.

*/

// Solution - 1

class Solution {
    public int similarPairs(String[] words) {
        int res = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                res += check(words[i], words[j]);
            }
        }
        return res;
    }

    public int check(String a, String b) {
        Set<Character> s1 = new HashSet<>();

        for (char c : a.toCharArray()) {
            s1.add(c);
        }

        Set<Character> s2 = new HashSet<>();

        for (char c : b.toCharArray()) {
            s2.add(c);
        }

        if (s1.equals(s2)) {
            return 1;
        }
        return 0;
    }
}

// Solution - 2

class Solution2 {
    public int similarPairs(String[] words) {
        int res = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                res += pair(words[i], words[j]);
            }
        }
        return res;
    }

    public int pair(String a, String b) {
        boolean arr1[] = new boolean[26];
        boolean arr2[] = new boolean[26];

        for (char c : a.toCharArray()) {
            arr1[c - 'a'] = true;
        }

        for (char c : b.toCharArray()) {
            arr2[c - 'a'] = true;
        }

        if (Arrays.equals(arr1, arr2)) {
            return 1;
        }
        return 0;
    }
}