class Solution {
    public ListNode findMiddle(ListNode head) {
        // Find the middle node
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // Return the middle node
    }

    public ListNode reverse(ListNode head) {
        // Reverse the list
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;  // Store the next node
            curr.next = prev;  // Reverse the link
            prev = curr;  // Move the previous pointer forward
            curr = next;  // Move the current pointer forward
        }
        return prev;  // Return the new head of the reversed list
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {  // If the list is empty or has only one node
            return true;
        }

        // Step 1: Find the middle node
        ListNode mid = findMiddle(head);

        // Step 2: Reverse the second half of the list
        ListNode secHalf = reverse(mid);

        // Step 3: Compare the first and second halves
        ListNode firHalf = head;
        ListNode temp = secHalf;  // Store the reversed half for restoration later (optional)
        boolean isPalindrome = true;
        while (secHalf != null) {
            if (firHalf.val != secHalf.val) {
                isPalindrome = false;
                break;
            }
            firHalf = firHalf.next;
            secHalf = secHalf.next;
        }

        // Step 4 (Optional): Restore the original list
        reverse(temp);

        return isPalindrome;
    }
}