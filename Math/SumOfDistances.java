/* 

2615. Sum of Distances

You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.
Return the array arr.

Example 1:
Input: nums = [1,3,1,1,2]
Output: [5,0,3,4,0]

Explanation: 
When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] = |0 - 2| + |0 - 3| = 5. 
When i = 1, arr[1] = 0 because there is no other index with value 3.
When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] = |2 - 0| + |2 - 3| = 3. 
When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] = |3 - 0| + |3 - 2| = 4. 
When i = 4, arr[4] = 0 because there is no other index with value 2. 

Example 2:
Input: nums = [0,5,3]
Output: [0,0,0]

Explanation: Since each element in nums is distinct, arr[i] = 0 for all i.

*/

class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> temp = map.get(nums[i]);
                temp.add(i);
                map.put(nums[i], map.getOrDefault(nums[i], temp));
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(nums[i], temp);
            }
        }

        int n = nums.length;
        long ans[] = new long[n];
        int itr = 0;
        for (int j : map.keySet()) {
            List<Integer> list = map.get(j);
            int sum = 0;

            if (list.size() > 1) {
                long rightSum = 0;
                long leftSum = 0;
                long currAns = 0;

                for (int i = 0; i < list.size(); i++) {
                    rightSum += (long) list.get(i);
                }

                for (int i = 0; i < list.size(); i++) {
                    int leftEle = i - 0;
                    int rightEle = list.size() - i;
                    currAns = (long) (Math.abs(((long) list.get(i) * (long) leftEle) - leftSum)
                            + Math.abs(rightSum - ((long) list.get(i) * (long) rightEle)));
                    leftSum += list.get(i);
                    rightSum -= list.get(i);
                    ans[list.get(i)] = currAns;
                }
            }
        }
        return ans;
    }
}