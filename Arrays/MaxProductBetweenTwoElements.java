/* 

1464. Maximum Product of Two Elements in an Array

Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 
Example 1:

Input: nums = [3,4,5,2]
Output: 12 

Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 

*/

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = nums[n - 1] - 1;
        int j = nums[n - 2] - 1;

        return i * j;
    }
}

class Solution2 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0;
        int res = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] - 1) * (nums[j] - 1) > max) {
                    res = (nums[i] - 1) * (nums[j] - 1);
                }
                max = Math.max(res, max);
            }
        }
        return max;
    }
}