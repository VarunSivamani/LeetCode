/* 

34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

*/

class Solution {

  public int[] searchRange(int[] nums, int target) {
    int[] res = new int[2];

    res[0] = findFirst(nums, target);
    res[1] = findLast(nums, target);

    return res;
  }

  public static int findFirst(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    int ind = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] > target) {
        end = mid - 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        ind = mid;
        end = mid - 1;
      }
    }
    return ind;
  }

  public static int findLast(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    int ind = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] > target) {
        end = mid - 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        ind = mid;
        start = mid + 1;
      }
    }
    return ind;
  }
}
