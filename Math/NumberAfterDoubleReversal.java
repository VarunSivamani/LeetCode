/* 

2119. A Number After a Double Reversal

Reversing an integer means to reverse all its digits.
For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.

Example 1:
Input: num = 526
Output: true

Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.

Example 2:
Input: num = 1800
Output: false

Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.

Example 3:
Input: num = 0
Output: true

Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.

*/

// Solution - 1

class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}

// Solution - 2

class Solution2 {
    public boolean isSameAfterReversals(int num) {
        int n1 = reverse(num);
        int n2 = reverse(n1);

        return n2 == num;
    }

    public int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        return rev;
    }
}

// Solution - 3

class Solution3 {
    public boolean isSameAfterReversals(int n) {
        StringBuilder s1 = new StringBuilder(String.valueOf(n));

        int i = Integer.parseInt(String.valueOf(s1.reverse()));

        s1 = new StringBuilder(String.valueOf(i)).reverse();

        return s1.toString().equals(String.valueOf(n));
    }
}