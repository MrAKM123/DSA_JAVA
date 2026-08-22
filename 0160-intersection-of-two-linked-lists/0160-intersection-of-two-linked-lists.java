/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if (headA == null || headB == null) {
            return null;
        }
        while (a != null && b != null) {
            a = a.next;
            b = b.next;
        }

        if (a == null) {
            // b yato bda hoga ya equal hoga
            int bExtra = 0;
            while (b != null) {
                bExtra++;
                b = b.next;

            }
            while (bExtra-- > 0) {
                headB = headB.next;

            }
        } else {
            // b==null
            // a ya to bada ya barabar hoga
            int aExtra = 0;
            while (a != null) {
                aExtra++;
                a = a.next;
            }

            while (aExtra-- > 0) {
                headA = headA.next;
            }
        }
        while (headA != null && headB != null) { // both ll have same size
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }
        return null;
    }
}