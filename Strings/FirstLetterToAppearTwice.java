/* 

2351. First Letter to Appear Twice

Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.
 
Example 1:
Input: s = "abccbaacz"
Output: "c"

Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.

*/

// Solution 1

class Solution {
    public char repeatedCharacter(String s) {
        int set[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            set[s.charAt(i) - 'a']++;
            if (set[s.charAt(i) - 'a'] == 2) {
                return s.charAt(i);
            }
        }
        return '0';
    }
}

// Solution 2

class Solution2 {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return '0';
    }
}