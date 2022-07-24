/*

1704. Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

Example 1:

Input: s = "book"
Output: true

Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

*/

// Solution - 1

class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        int count = 0, l = 0, r = 0;

        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        for (int i = 0; i < str.length() / 2; i++) {
            if (list.contains(str.charAt(i))) {
                l++;
            }
        }

        for (int i = str.length() / 2; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                r++;
            }
        }

        if (l == r) {
            return true;
        }
        return false;
    }
}

// Solution - 2

class Solution {
    public boolean halvesAreAlike(String s1) {
        int len = s1.length();
        int len1 = len / 2;
        String s = s1.toLowerCase();
        int i;
        int l = 0, r = 0;
        for (i = 0; i < len1; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                l++;
            }
        }

        for (i = len1; i < len; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                r++;
            }
        }

        if (l == r) {
            return true;
        }

        return false;
    }
}