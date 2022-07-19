/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode next = null, temp;
        ListNode dummy = new ListNode(0);
        temp = dummy;
        dummy.next = head;
        while(dummy.next != null) {
            next = dummy.next;
            if(next.val == val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }
        
        return temp.next;
    }
}