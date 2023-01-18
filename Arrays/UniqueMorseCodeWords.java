/* 

804. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.
 
Example 1:
Input: words = ["gin","zen","gig","msg"]
Output: 2

Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".

Example 2:
Input: words = ["a"]
Output: 1

*/

// Solution - 1

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.." };

        Set<String> set = new HashSet<>();

        for (String s : words) {
            String res = "";
            for (char c : s.toCharArray()) {
                res += str[c - 'a'];
            }
            set.add(res);
        }
        return set.size();
    }
}

// Solution - 2

class Solution2 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.." };

        HashMap<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 97), str[i]);
        }

        for (String s : words) {
            String res = "";
            for (char c : s.toCharArray()) {
                res += map.get(c);
            }
            set.add(res);
        }
        return set.size();
    }
}