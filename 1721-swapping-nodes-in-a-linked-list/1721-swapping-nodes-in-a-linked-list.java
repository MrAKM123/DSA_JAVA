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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prev = head;
        ListNode curr = head;
        if(head == null || head.next == null){
            return head;
        }
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }
          ListNode swap = curr;
        while (curr.next != null) {
            prev = prev.next;
            curr = curr.next;
        }
        if(swap == prev ){
            return head;
        }

        int temp = swap.val;
        swap.val = prev.val;
        prev.val = temp;

        return head;

    }
}