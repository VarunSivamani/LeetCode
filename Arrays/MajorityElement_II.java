/*

229. Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]

*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] && i!=j){
                    count++;
                }
            }
            
            if(count > n/3){
                set.add(nums[i]);
            }
        }
        
        for(int i:set){
            list.add(i);
        }
        return list;
    }
}