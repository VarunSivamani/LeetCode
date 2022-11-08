/* 

1089. Duplicate Zeros


Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything. 

Example 1:
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]

Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:
Input: arr = [1,2,3]
Output: [1,2,3]

Explanation: After calling your function, the input array is modified to: [1,2,3]

*/

// Solution - 1

class Solution {
    public void duplicateZeros(int[] arr) {
        int ind = 0;

        while (ind < arr.length - 1) {
            if (arr[ind] == 0) {
                insert(arr, ind);
                arr[ind + 1] = 0;
                ind += 2;
            } else {
                ind++;
            }
        }
    }

    public void insert(int[] arr, int ind) {
        for (int i = arr.length - 1; i > ind; i--) {
            arr[i] = arr[i - 1];
        }
    }
}

// Solution - 2

class Solution2 {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                queue.add(0);
                queue.add(0);
            } else {
                queue.add(arr[i]);
            }

            Integer first = queue.poll();
            arr[i] = first;
        }
    }
}