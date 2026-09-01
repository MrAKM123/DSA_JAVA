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
        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;

        int d = len - n;
        if (head == null || head.next == null) {
            return null;
        }

        for (int i = 0; i < d ; i++) {

            prev = prev.next;

        }
        prev.next = prev.next.next;

        return temp.next;
    }
}