/*

1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2

Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Example 2:
Input: nums = [555,901,482,1771]
Output: 1 

Explanation: 
Only 1771 contains an even number of digits.

*/

// Solution 1

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        
        for(int i=0;i<nums.length;i++){
            ans += divisible(nums[i]);
        }
        return ans;
    }
    
    public int divisible(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        
        if(count % 2 == 0){
            return 1;
        }
        return 0;
    }
}

// Solution 2

class Solution2 {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int val : nums){
            String s = String.valueOf(val);
            
            if(s.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}