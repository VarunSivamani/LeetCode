/*

383. Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote. 

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

*/

// Solution - 1

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char i : ransomNote.toCharArray()) {
            if (!map.containsKey(i) || map.get(i) == 0) {
                return false;
            } else {
                map.put(i, map.get(i) - 1);
            }
        }
        return true;
    }
}

// Solution - 2

class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[26];

        for (char i : magazine.toCharArray()) {
            a[i - 'a']++;
        }

        for (char i : ransomNote.toCharArray()) {
            if (a[i - 'a'] == 0) {
                return false;
            } else {
                a[i - 'a']--;
            }
        }
        return true;
    }
}