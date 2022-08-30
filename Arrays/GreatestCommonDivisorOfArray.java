/* 

1979. Find Greatest Common Divisor of Array

Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

Example 1:
Input: nums = [2,5,6,9,10]
Output: 2

Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

Example 2:
Input: nums = [7,5,6,8,3]
Output: 1

Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

*/

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        int n = nums[0];
        int m = nums[nums.length - 1];

        return gcd(m, n);
    }

    public static int gcd(int m, int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
}
