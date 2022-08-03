/*
  
884. Uncommon Words from Two Sentences

A sentence is a string of single-space separated words where each word consists only of lowercase letters.
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]

Example 2:
Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
 
*/

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words = s1.split(" ");
        String[] words2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> res = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}