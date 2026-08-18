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
    public ListNode midNode(ListNode head ,ListNode slow, ListNode fast){
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode forw = curr.next;
           curr.next = prev;

            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        // break from middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode list2 = midNode( head, slow, fast);
         //seprete list 1 N 2 
        ListNode temp = head;
        while(temp.next != list2){
            temp = temp.next;
        }
        temp.next = null;

        //revrese list 2
        ListNode head2 = reverseLL(list2);


        // compare head1 N head2
        ListNode temp1 = head;
        ListNode temp2 = head2;
        while(temp1 != null && temp2 != null ){
            if(temp1.val != temp2.val){
                return false;
            }else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return true;
    }
}