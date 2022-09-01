/*
 
1572. Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the
elements on the secondary diagonal that are not part of the primary diagonal.
 
Example 1:
 
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
 
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
 
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // first diagonal
            if (i != (n - i - 1)) {
                sum += mat[i][n - i - 1]; // second diagonal
            }
        }
        return sum;
    }
}