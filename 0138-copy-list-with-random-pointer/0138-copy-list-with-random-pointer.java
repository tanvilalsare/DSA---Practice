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
        if (head == null) {
            return null;
        }

        // STEP 1: Create a copy node and insert it right next to the original node
        Node curr = head;
        while (curr != null) {
            Node clone = new Node(curr.val);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next; // Move to the next original node
        }

        // STEP 2: Assign random pointers for the copy nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                // The copy's random should point to the copy of the original's random
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next; // Move past the clone to the next original node
        }

        // STEP 3: Unweave the lists to restore the original and extract the copy
        curr = head;
        Node cloneHead = head.next;
        Node currClone = cloneHead;

        while (curr != null) {
            curr.next = curr.next.next; // Restore original next pointer
            if (currClone.next != null) {
                currClone.next = currClone.next.next; // Link clone next pointer
            }
            
            curr = curr.next;
            currClone = currClone.next;
        }

        return cloneHead;
    }
}