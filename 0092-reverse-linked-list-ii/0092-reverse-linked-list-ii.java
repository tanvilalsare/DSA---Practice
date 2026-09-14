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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){// handles the case where the list is null or of only one node 
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;//dummy starts with 0 and head is at 1 
        ListNode prevLeft = dummy; // just before the left node
        for(int i =1;i<left;i++){
            prevLeft = prevLeft.next;//keep moving forward until i=left i.e till node just behind left 
        } 
        ListNode curr = prevLeft.next;//curr is at the left so it will be the tail as it will be reversed 
        ListNode prev = null;
        for(int i =0;i<=right-left;i++){// how many nodes are in that segment — a size, not a location. i here is just a loop counter, not an index into the list.
            ListNode next = curr.next;
            curr.next = prev; // normal reversing 
            prev = curr;
            curr =next;
        }
        prevLeft.next.next = curr;
        prevLeft.next = prev;
        return dummy.next;

    }
}