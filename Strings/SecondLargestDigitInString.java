/* 

1796. Second Largest Digit in a String

Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1:
Input: s = "dfa12321afd"
Output: 2

Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

Example 2:
Input: s = "abc1111"
Output: -1

Explanation: The digits that appear in s are [1]. There is no second largest digit. 

*/

// Solution - 1

class Solution {
    public int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                int num = ch - '0';
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        Collections.sort(list);
        return list.size() > 1 ? list.get(list.size() - 2) : -1;
    }
}

// Solution - 2

class Solution2 {
    public int secondHighest(String s) {
        int largest = -1;
        int second_largest = -1;

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                if ((ch - '0') > largest) {
                    second_largest = largest;
                    largest = ch - '0';
                } else if ((ch - '0') < largest && (ch - '0') > second_largest) {
                    second_largest = ch - '0';
                }
            }
        }
        return second_largest;
    }
}