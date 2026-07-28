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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);// dummy starting 1 before head 
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next!= null){
            if(curr.next.val == val){// curr moves to search if its = val
                curr.next = curr.next.next;// skip the =val element 
            }else{
                curr = curr.next;// if we did'nt find the number taht == val 
            }
        }
        return dummy.next;// as head strts from 1 and dummy form 0 so .next = head 
    }
}