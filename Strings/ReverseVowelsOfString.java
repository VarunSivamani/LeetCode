/* 

345. Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"

*/

class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);

            if (!vowel(a)) {
                i++;
            }

            if (!vowel(b)) {
                j--;
            }

            if (vowel(a) && vowel(b)) {
                ch[i] = b;
                ch[j] = a;
                i++;
                j--;
            }
        }
        return new String(ch);
    }

    boolean vowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}