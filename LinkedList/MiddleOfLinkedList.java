/* 

876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]

Explanation: The middle node of the list is node 3.

Example 2:

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]

Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

*/

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        ListNode tmp1 = head;
        int count = 0;
        int re = 0;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        if (count % 2 == 0) {
            re = count / 2;

            for (int i = 0; i < re; i++) {
                tmp1 = tmp1.next;
            }
        } else {
            re = (count + 1) / 2;
            for (int i = 0; i < re; i++) {
                tmp1 = tmp1.next;
            }
        }
        return tmp1;
    }
}