/* 

75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

*/

class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        int ind = 0;

        for (int i : nums) {
            if (i == 0) {
                c0++;
            } else if (i == 1) {
                c1++;
            } else {
                c2++;
            }
        }

        for (int i = 0; i < c0; i++) {
            nums[ind++] = 0;
        }

        for (int i = c0; i < c1 + c0; i++) {
            nums[ind++] = 1;
        }
        for (int i = c1 + c0; i < nums.length; i++) {
            nums[ind++] = 2;
        }
    }
}