/*

2248. Intersection of Multiple Arrays

Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order. 

Example 1:
Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
Output: [3,4]

Explanation: 
The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].

Example 2:
Input: nums = [[1,2,3],[4,5,6]]
Output: []

Explanation: 
There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].

*/

// Solution - 1

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[1001];

        for (int[] arr : nums) {
            for (int i : arr) {
                count[i]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == nums.length) {
                list.add(i);
            }
        }

        return list;
    }
}

// Solution - 2

class Solution2 {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int[] arr : nums) {
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == nums.length) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        return list;
    }
}