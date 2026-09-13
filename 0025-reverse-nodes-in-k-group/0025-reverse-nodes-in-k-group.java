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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;

        }
        if(k > len){
            return head;
        }
        curr = head;
        ListNode prev = null;
        
        for(int i  = 1; i <=k; i++){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        ListNode recursionKaHead = reverseKGroup(curr, k);
        head.next =recursionKaHead;
        return prev;
    }
}