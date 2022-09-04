/* 

557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"

*/

// Solution 1

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder("");
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            res.append(sb.reverse() + " ");
            sb.delete(0, s.length());
        }
        return res.toString().trim();
    }
}

// Solution 2

class Solution2 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < arr.length; i++) {
            sb.append(reverse(arr[i]) + " ");
        }
        return sb.toString().trim();
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}