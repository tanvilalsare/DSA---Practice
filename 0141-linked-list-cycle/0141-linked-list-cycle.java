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
    public boolean hasCycle(ListNode head) {// fast slow pointer method
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){// they meet here hence this is the pos 
            return true; 
           }
        }
        return false;
    }
}