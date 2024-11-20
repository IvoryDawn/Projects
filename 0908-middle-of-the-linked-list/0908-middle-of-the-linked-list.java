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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        if(head == null || head.next == null){
            return head;
        }
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size % 2 == 0)
            size = (size / 2);
        else
            size = (size / 2) + 1;
        temp = head;
        for(int i = 0; i < size; i++){
            temp = temp.next;
        }
        ListNode curr = head;
        while(temp.next != null){
            temp = temp.next;
            curr = curr.next;
        }
        return curr.next;
    }
}