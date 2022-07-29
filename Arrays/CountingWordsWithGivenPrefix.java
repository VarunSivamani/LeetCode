/*

2185. Counting Words With a Given Prefix

You are given an array of strings words and a string pref.
Return the number of strings in words that contain pref as a prefix.
A prefix of a string s is any leading contiguous substring of s.

Example 1:
Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2

Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".

*/

// Solution 1

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref.length()) {
                String temp = words[i].substring(0, pref.length());
                if (pref.equals(temp)) {
                    count++;
                }
            }
        }
        return count;
    }
}

// Solution 2

class Solution2 {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}