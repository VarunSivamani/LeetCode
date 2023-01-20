/* 

1189. Maximum Number of Balloons

Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:
Input: text = "nlaebolko"
Output: 1

Example 2:
Input: text = "loonbalxballpoon"
Output: 2

Example 3:
Input: text = "leetcode"
Output: 0

*/

// Solution 1

class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        int count = 0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }

            if (b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1) {
                count++;

                b -= 1;
                a -= 1;
                l -= 2;
                o -= 2;
                n -= 1;
            }
        }
        return count;
    }
}

// Solution 2

class Solution2 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        String word = "balloon";

        for (Character ch : word.toCharArray()) {
            map.put(ch, 0);
        }

        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = Integer.MAX_VALUE;
        count = Math.min(map.get('b'), count);
        count = Math.min(map.get('a'), count);
        count = Math.min(map.get('l') / 2, count);
        count = Math.min(map.get('o') / 2, count);
        count = Math.min(map.get('n'), count);
        return count;
    }
}