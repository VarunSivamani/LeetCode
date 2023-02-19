/* 

204. Count Primes

Given an integer n, return the number of prime numbers that are strictly less than n.
 
Example 1:
Input: n = 10
Output: 4

Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0

*/

class Solution {

  public int countPrimes(int n) {
    int res = 0;
    boolean[] isPrime = new boolean[n + 1];

    if (n <= 2) {
      return res;
    }

    for (int i = 2; i < n; i++) {
      isPrime[i] = true;
    }

    for (int i = 2; i * i <= n; i++) {
      if (isPrime[i]) {
        for (int j = 2 * i; j <= n; j += i) {
          isPrime[j] = false;
        }
      }
    }

    for (int i = 2; i < n; i++) {
      if (isPrime[i]) {
        res++;
      }
    }

    return res;
  }
}
