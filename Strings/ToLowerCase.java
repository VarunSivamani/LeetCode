/* 

709. To Lower Case

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:

Input: s = "Hello"
Output: "hello"

Example 2:

Input: s = "here"
Output: "here"

*/

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}

class Solution2 {
    public String toLowerCase(String s) {

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] > 64 && c[i] < 91) {
                c[i] += 32;
            }
        }
        return String.valueOf(c);
    }
}