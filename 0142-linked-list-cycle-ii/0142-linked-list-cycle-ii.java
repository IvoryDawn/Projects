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
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        // Detect cycle using two-pointer technique
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) { // Cycle detected
                length = lengthCycle(slow);
                break;
            }
        }
        
        if (length == 0) { // No cycle
            return null;
        }
        
        // Find the start of the cycle
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        
        // Move pointer2 `length` steps ahead
        for (int i = 0; i < length; i++) {
            pointer2 = pointer2.next;
        }
        
        // Move both pointers at the same speed; they meet at the cycle start
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        
        return pointer1;
    }

    // Helper function to calculate cycle length
    private int lengthCycle(ListNode slow) {
        ListNode temp = slow;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        } while (temp != slow);
        return length;
    }
}