/*
1684. Count the Number of Consistent Strings

You are given a string allowed consisting of distinct characters and an array
of strings words. A string is consistent if all characters in the string
appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2

Explanation: Strings "aaab" and "baa" are consistent since they only contain
characters 'a' and 'b'.

*/

// Solution - 1

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;

        Set<Character> s = new HashSet<Character>();

        for (int i = 0; i < allowed.length(); i++) {
            s.add(allowed.charAt(i));
        }

        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            int count = 0;

            for (int j = 0; j < curr.length(); j++) {
                char c = curr.charAt(j);
                if (s.contains(c)) {
                    count++;
                }

                if (count == curr.length()) {
                    ans++;
                }
            }
        }

        return ans;
    }
}

// Solution - 2

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;

        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < allowed.length(); i++) {
            if (!list.contains(allowed.charAt(i))) {
                list.add(allowed.charAt(i));
            }
        }

        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            int count = 0;

            for (int j = 0; j < curr.length(); j++) {
                char c = curr.charAt(j);
                if (list.contains(c)) {
                    count++;
                }

                if (count == curr.length()) {
                    ans++;
                }
            }
        }

        return ans;
    }
}