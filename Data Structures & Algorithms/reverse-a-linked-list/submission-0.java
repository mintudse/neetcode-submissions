/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

0 -> 1 -> 2 -> 3 -> null
3 -> 2 -> 1 -> 0 -> null
if empty, return empty
linked list of ints?

curr
//prev
tmp
0 | 1 | 2  ->    1 | 2 | 3
curr     curr.next
REMEMBER what curr pointed to
tmp = curr.next
tmp -> 1 | 2 | 3
make curr.next = null
0 | 2 | 3 ->  null
move on, curr is what prev pointed to
curr -> tmp
curr -> 1 | 2 | 3

0 ->    1 
curr     curr.next

REMEMBER what curr pointed to
DO: tmp = curr.next
tmp -> 1 
DO: make curr.next = null
0  ->  null
move on, curr is what prev pointed to
DO: curr -> tmp
curr -> 1
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        // 0 -> null | 1 -> 0 -> null 2 -> 3 -> null
        //  3 -> 2 -> 1 -> 0 -> null null
        //                     curr -> 3
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            // tmp -> null
            ListNode tmp = curr.next;
            // 3 -> 2
            curr.next = prev;
            // prev -> 3
            prev = curr;
            // curr -> null
            curr = tmp;
        }
        
        return prev;
    }
}
