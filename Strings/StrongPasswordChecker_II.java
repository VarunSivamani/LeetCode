/*

2299. Strong Password Checker II

A password is said to be strong if it satisfies all the following criteria:
- It has at least 8 characters.
- It contains at least one lowercase letter.
- It contains at least one uppercase letter.
- It contains at least one digit.
- It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
- It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).

Given a string password, return true if it is a strong password. Otherwise, return false.

Example 1:
Input: password = "IloveLe3tcode!"
Output: true

Explanation: The password meets all the requirements. Therefore, we return true.

Example 2:
Input: password = "Me+You--IsMyDream"
Output: false

Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.

Example 3:
Input: password = "1aB!"
Output: false

Explanation: The password does not meet the length requirement. Therefore, we return false.

*/

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String special = "!@#$%^&*()-+";
        if (password.length() >= 8) {
            int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
            for (int i = 0; i < password.length() - 1; i++) {
                if (password.charAt(i) == password.charAt(i + 1)) {
                    return false;

                }
            }
            for (int i = 0; i < password.length(); i++) {

                if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                    c1++;
                }

                if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                    c2++;
                }

                if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    c3++;
                }

                for (int j = 0; j < special.length(); j++) {
                    if (password.charAt(i) == special.charAt(j)) {
                        c4++;
                    }
                }

                if (c1 > 0 && c2 > 0 && c3 > 0 && c4 > 0) {
                    return true;
                }

            }

        }
        return false;
    }
}