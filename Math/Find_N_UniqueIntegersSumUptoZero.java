/* 

1304. Find N Unique Integers Sum up to Zero

Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]

Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:
Input: n = 3
Output: [-1,0,1]

Example 3:
Input: n = 1
Output: [0]

*/

class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        
        if(n%2!=0){
            for(int i=0;i<n-1;i+=2){
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }    
            arr[n-1] = 0;
        }else{
            for(int i=0;i<n-1;i+=2){
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }    
        }
        return arr;
    }
}