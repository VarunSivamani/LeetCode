/* 

434. Number of Segments in a String

Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.

Example 1:
Input: s = "Hello, my name is John"
Output: 5

Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

Example 2:
Input: s = "Hello"
Output: 1

*/

class Solution {
    public int countSegments(String s) {
        String tr = s.trim();
        String str[] = tr.split("\\s+");

        if (tr.equals("")) {
            return 0;
        }

        return str.length;
    }
}