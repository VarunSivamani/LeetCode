/* 

796. Rotate String

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:
Input: s = "abcde", goal = "abced"
Output: false

*/

// Solution 1

class Solution1 {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}

// Solution 2

class Solution2 {
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.delete(0, 1);

            if (sb.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
