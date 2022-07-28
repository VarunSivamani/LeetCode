/* 

2341. Maximum Number of Pairs in Array

You are given a 0-indexed integer array nums. In one operation, you may do the following:

Choose two integers in nums that are equal.
Remove both integers from nums, forming a pair.
The operation is done on nums as many times as possible.
Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.

Example 1:

Input: nums = [1,3,2,1,3,2,2]
Output: [3,1]

Explanation:
Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.

*/

// Solution 1

class Solution {
    public int[] numberOfPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int c = 0;
        int balance = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);

            if (map.get(i) == 2) {
                map.remove(i);
                c++;
            }
        }
        balance = map.size();

        return new int[] { c, balance };
    }
}

// Solution 2

class Solution2 {
    public int[] numberOfPairs(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int balance = 0;
        int pairs = 0;

        for (int i : nums) {
            if (set.contains(i)) {
                pairs++;
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        balance = set.size();

        return new int[] { pairs, balance };
    }
}

// Solution 3

class Solution3 {
    public int[] numberOfPairs(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int balance = 0;
        int pairs = 0;

        for (int i : nums) {
            if (!list.contains(i)) {
                list.add(i);
            } else {
                pairs++;
                list.remove(Integer.valueOf(i));
            }
        }
        balance = list.size();

        return new int[] { pairs, balance };
    }
}