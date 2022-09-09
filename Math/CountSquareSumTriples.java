/*

1925. Count Square Sum Triples

A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.
Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.

Example 1:
Input: n = 5
Output: 2

Explanation: The square triples are (3,4,5) and (4,3,5).

Example 2:
Input: n = 10
Output: 4

Explanation: The square triples are (3,4,5), (4,3,5), (6,8,10), and (8,6,10).

*/

class Solution {
    public int countTriples(int n) {
        int count = 0;

        for (int a = 1; a <= n + 2; a++) {
            for (int b = a + 1; b <= n + 1; b++) {
                for (int c = b + 1; c <= n; c++) {
                    double lhs = a * a + b * b;
                    double rhs = c * c;

                    if (lhs == rhs) {
                        count += 2;
                    }
                }
            }
        }
        return count;
    }
}