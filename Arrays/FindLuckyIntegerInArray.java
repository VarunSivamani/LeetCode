/* 

1394. Find Lucky Integer in an Array

Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return the largest lucky integer in the array. If there is no lucky integer return -1.
 
Example 1:
Input: arr = [2,2,3,4]
Output: 2

Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

Example 2:
Input: arr = [1,2,2,3,3,3]
Output: 3

Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

Example 3:
Input: arr = [2,2,2,3,3]
Output: -1

Explanation: There are no lucky numbers in the array.

*/

// Solution - 1 

class Solution {
    public int findLucky(int[] arr) {
        int freq[] = new int[501];

        for(int i:arr){
            freq[i]++;
        }

        int max = -1;

        for(int i=1;i<freq.length;i++){
            if(freq[i]==i){
                max = i;
            }
        }

        return max;
    }
}

// Solution - 2

class Solution2 {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int max = -1;

        for (int i : map.keySet()) {
            if (i == map.get(i)) {
                max = Math.max(max, i);
            }
        }
        return max;
    }
}