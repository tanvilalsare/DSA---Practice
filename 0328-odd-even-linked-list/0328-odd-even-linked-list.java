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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next ;
        ListNode evenHead = even; // start of the even node as like odd withh come first then even so this will rember the entry point for the even node 
        while(even != null && even.next != null){
            odd.next = even.next;// nest odd with be the number after even so odd.next = even.next 
            odd = odd.next;// make the new odd forund as odd like odd = odd.next 
            even.next = odd.next;// next even will be the node after odd so this 
            even = even.next; // make the new even 
        }
        odd.next = evenHead; // when even hit null the odd will be the entry point for the even index 
        return head;
    }
}