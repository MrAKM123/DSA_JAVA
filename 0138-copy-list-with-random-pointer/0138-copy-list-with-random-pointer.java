/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }
        //step1 add clone node
        Node temp = head;
        while(temp != null){
            Node clonedNode = new Node(temp.val);
            clonedNode.next = temp.next;
            temp.next = clonedNode;
            temp =clonedNode.next;
        }
        //step2 copy random pointers
        temp = head;
        while(temp != null){
            Node oldNode = temp;
            Node newNode = temp.next;

            // obeservation new node ka random = old node ke random ka next
            if(oldNode.random != null){
                newNode.random = oldNode.random.next;
            }   
            temp = newNode.next;
        }
        // Step 3 detach old nodes
        temp = head;
        Node ansNewHead = head.next;
        while(temp != null){
            Node oldNode = temp;
            Node newNode = temp.next;
            oldNode.next = newNode.next;
            if(newNode.next != null){
                newNode.next = newNode.next.next;
            }
            temp =temp.next;
        
        }
        return ansNewHead;
    }
}