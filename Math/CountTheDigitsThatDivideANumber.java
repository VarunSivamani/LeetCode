/* 

2520. Count the Digits That Divide a Number

Given an integer num, return the number of digits in num that divide num.
An integer val divides nums if nums % val == 0.

Example 1:
Input: num = 7
Output: 1

Explanation: 7 divides itself, hence the answer is 1.

Example 2:
Input: num = 121
Output: 2

Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.

Example 3:
Input: num = 1248
Output: 4

Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

*/

// Solution - 1

class Solution {
    public int countDigits(int num) {
        int tmp = num;
        int c=0;

        while(tmp!=0){
            int r = tmp%10;
            if(num % r==0){
                c++;
            }
            tmp/=10;
        }
        return c;
    }
}

// Solution - 2

class Solution2 {
    public int countDigits(int num) {
        int c=0;
        List<Integer> list = new ArrayList<>();
        int tmp = num;

        while(tmp != 0){
            list.add(tmp % 10);
            tmp /= 10;
        }

        for(int i=0;i<list.size();i++){
            if(num % list.get(i) == 0){
                c++;
            }
        }
        return c;
    }
}