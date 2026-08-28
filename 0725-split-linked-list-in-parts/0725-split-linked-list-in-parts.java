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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        int base = len / k;
        int extraNode = len % k;

        curr = head;
        ListNode prev = null;
        for (int part = 0; part < k; part++) {

            ans[part] = curr;

            int width = base + (extraNode > 0 ? 1 : 0);
            extraNode--;
            for (int i = 1; i <= width; i++) {
                prev = curr;
                if (curr != null) {
                    curr = curr.next;
                }
            }
            if (prev != null) {
                prev.next = null;
                prev = null;

            }
        }

        return ans;
    }
}