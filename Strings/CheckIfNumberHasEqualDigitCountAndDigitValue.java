/* 

2283. Check if Number Has Equal Digit Count and Digit Value

You are given a 0-indexed string num of length n consisting of digits.
Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false. 

Example 1:
Input: num = "1210"
Output: true

Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.

Example 2:
Input: num = "030"
Output: false

Explanation:
num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
num[2] = '0'. The digit 2 occurs zero times in num.
The indices 0 and 1 both violate the condition, so return false.

*/

// Solution - 1

class Solution {
    public boolean digitCount(String num) {
        int freq[] = new int[10];

        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            if (Character.getNumericValue(num.charAt(i)) != freq[i]) {
                return false;
            }
        }
        return true;
    }
}

// Solution - 2

class Solution2 {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            int k = num.charAt(i) - '0';
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            if (map.getOrDefault(i, 0) != num.charAt(i) - '0') {
                return false;
            }
        }
        return true;
    }
}
