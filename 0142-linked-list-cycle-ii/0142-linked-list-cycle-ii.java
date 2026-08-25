/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        Boolean hasCyclic = false;
        // detect cyclic
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                hasCyclic = true;
                break;
            }
        }
        if (hasCyclic == false) {
            return null;
        }
        // cyclic head
        // slow ko head pr rakho aur fast jaha h wahi rhega
        // slow ansd fast ko ek ek step age bada
        // when they meet rhe node is starting of that cyclic
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

        //  // using set complexity
        //        if(head == null || head.next == null ){
        //         return null;
        //        } 
        //        HashSet<ListNode> set  = new HashSet<>();
        //        ListNode temp = head;
        //        while(temp != null){
        //         if(set.contains(temp)){
        //             return temp;
        //         }
        //          set.add(temp);
        //          temp =temp.next;
        //        }
        //        return temp;
    }
}