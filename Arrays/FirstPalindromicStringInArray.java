/* 

2108. Find First Palindromic String in the Array

Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"

Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

*/

class Solution {
    public String firstPalindrome(String[] words) {
        for (String string : words) {
            if (palindrome(string)) {
                return string;
            }
        }
        return "";
    }

    public Boolean palindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}