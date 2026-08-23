/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 432
 +82
 514 (carry the one)

 123
+347
470 (carry the one)

5
+9
14 (carry the one)
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode();  // linked list to return
       ListNode cur = dummy;

    //    ListNode cur1 = l1; // 5
    //    ListNode cur2 = l2; // 9
    //    int sum = 0;
       int carry = 0;

// calculations
       while (l1 != null || l2 != null || carry!= 0 ){
        int v1;
        int v2;
        if (l1 != null){
            v1 = l1.val;
        } else { v1 = 0;}
        
        if (l2 != null){
            v2 = l2.val;
        } else { v2 = 0;}

        int val = v1 + v2 + carry;
        carry = val / 10; // get the carry ie: 1
        val = val % 10; // get the ones place ie: 4

        cur.next = new ListNode(val);
        

        //change pointers
        cur = cur.next;
        if (l1 != null){
            l1 = l1.next;
        } else {l1 = null;}

        if (l2 != null){
            l2 = l2.next;
        } else {l2 = null;}
    
        }
        return dummy.next;

    }
}