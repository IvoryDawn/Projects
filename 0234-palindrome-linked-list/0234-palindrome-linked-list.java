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
    public ListNode findMiddle(ListNode head){
        // Find the middle node
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        // Reverse the list
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;  // Store next node value
            curr.next = prev;  // Make previuos value curr.next
            prev = curr;  // Make current node previous
            curr = next;  // Update current node
        }
        return prev;  // Returns the strting of the list
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next == null || head == null){  // If list is empty or has only 1 node
            return true;
        }        
        ListNode mid = findMiddle(head);  // Store middle node
        ListNode secHalf = reverse(mid.next);  // Reverse the ;ist after middle node
        ListNode firHalf = head; 
        while(secHalf != null){  // Chec only for secHalf to reduce time
            if(firHalf.val != secHalf.val){  // Check whether values are equal or not
                return false; 
            }
            secHalf = secHalf.next;
            firHalf = firHalf.next;
        }
        return true;
    }
}