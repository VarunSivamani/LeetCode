/* 

338. Counting Bits

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 
Example 1:
Input: n = 2
Output: [0,1,1]

Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]

Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

*/

// Solution - 1

class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = count(i);
        }
        return dp;
    }

    public static int count(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

}

// Solution - 2

class Solution2 {
    public int[] countBits(int n) {
        int dp[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.bitCount(i);
        }
        return dp;
    }
}

// Solution - 3

class Solution3 {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = count(i);
        }

        return dp;
    }

    public int count(int n) {
        String s = Integer.toBinaryString(n).replaceAll("0", "");
        return s.length();
    }
}