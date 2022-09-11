/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode findCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return slow;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode pointer = findCycle(head);
        if (pointer == null)
            return null;
        while(temp!=pointer) {
            temp = temp.next;
            pointer = pointer.next;
        }
        return temp;
    }
}