/* 

2496. Maximum Value of a String in an Array

The value of an alphanumeric string can be defined as:
- The numeric representation of the string in base 10, if it comprises of digits only.
- The length of the string, otherwise.

Given an array strs of alphanumeric strings, return the maximum value of any string in strs.

Example 1:
Input: strs = ["alic3","bob","3","4","00000"]
Output: 5

Explanation: 
- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
- "bob" consists only of letters, so its value is also its length, i.e. 3.
- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
- "4" also consists only of digits, so its value is 4.
- "00000" consists only of digits, so its value is 0.
Hence, the maximum value is 5, of "alic3".

Example 2:
Input: strs = ["1","01","001","0001"]
Output: 1

Explanation: 
Each string in the array has value 1. Hence, we return 1.

*/

class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (String s : strs) {
            max = Math.max(max, isNumeric(s) ? Integer.valueOf(s) : s.length());
        }
        return max;
    }

    public boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}