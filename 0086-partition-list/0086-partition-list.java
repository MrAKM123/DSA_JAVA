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
    public ListNode partition(ListNode head, int x) {
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        ListNode higherHead = new ListNode(-1);
        ListNode higherTail = higherHead;
        
        ListNode temp = head;

        while( temp != null){
            if(temp.val < x){
                lesserTail.next = temp;
                lesserTail = temp;

            }

            if(temp.val >=x){
                higherTail.next = temp;
                higherTail = temp;
            }
            temp = temp.next;

        }

        lesserTail.next = higherHead.next;
        higherTail.next = null;
        lesserHead = lesserHead.next; 

        return lesserHead;
    }
}