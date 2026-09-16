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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){//when list is empty or only one node 
            return null;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            prev = slow;
            slow = slow.next;// slow will move 1 step 
            fast = fast.next.next;// fast will move 2 step 
        }
        prev.next = slow.next;// unlinking the slow from the list as its the middle and we have to delet it 
        return head;
    }
}