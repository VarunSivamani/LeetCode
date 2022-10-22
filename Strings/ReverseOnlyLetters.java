/* 
 
917. Reverse Only Letters

Given a string s, reverse the string according to the following rules:
- All the characters that are not English letters remain in the same position.
- All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it. 

Example 1:
Input: s = "ab-cd"
Output: "dc-ba"

Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

*/

// Solution - 1 

class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;

        char[] chars = s.toCharArray();

        while (i < j) {
            while (i < j && !Character.isLetter(chars[i])) {
                i++;
            }

            while (i < j && !Character.isLetter(chars[j])) {
                j--;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;

        }
        return new String(chars);
    }
}

// Solution - 2

class Solution2 {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                ans.append(stack.pop());
            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}