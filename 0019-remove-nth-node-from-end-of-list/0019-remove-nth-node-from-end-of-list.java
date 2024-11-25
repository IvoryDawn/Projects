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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(n == len){
            return head.next;
        }
        int idx = (len - n);
        temp = head;
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
}