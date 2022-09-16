/*

326. Power of Three

Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3^x.

Example 1:
Input: n = 27
Output: true

Explanation: 27 = 33

Example 2:
Input: n = 0
Output: false

Explanation: There is no x where 3^x = 0.

Example 3:
Input: n = -1
Output: false

Explanation: There is no x where 3^x = (-1).

*/

class Solution {
    public boolean isPowerOfThree(int n) {
        long ans = 1;

        while (ans < n) {
            ans = ans * 3;
        }
        return ans == n;
    }
}