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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next== null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev!= null && prev.next != null && prev.next.next != null){// handles for head being even or odd length
            ListNode first = prev.next;
            ListNode second = first.next;
            first.next = second.next ;// swap 
            second.next = first;
            prev.next = second;
            prev = first;// move 2 step ahead 
        }
        return dummy.next;
    }
}