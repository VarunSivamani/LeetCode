/* 

1784. Check if Binary String Has at Most One Segment of Ones

Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.

Example 1:
Input: s = "1001"
Output: false

Explanation: The ones do not form a contiguous segment.

Example 2:
Input: s = "110"
Output: true

*/

// Solution - 1

class Solution {
    public boolean checkOnesSegment(String s) {
        int counter = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1' && s.charAt(i) != s.charAt(i + 1)) {
                counter++;
            }
        }

        if (s.charAt(s.length() - 1) == '1') {
            counter++;
        }

        return counter == 1;
    }
}

// Solution - 2

class Solution2 {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}