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
import java.util.Deque;
import java.util.ArrayDeque;
class Solution{
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        // add the list to the deque
        ListNode curr = head;
        while(curr != null){
            deque.addLast(curr.val);// new ele added at last in queue like given in example 
            curr= curr.next;
        }
        // compare front and back
        while(deque.size()>1){
            int front = deque.pollFirst();// poll not just take the num but also delete it so it will shift one front like new front will be 2 and then it will compare 
            int back = deque.pollLast();// poll not just take the num but also delete it so it will shift one back like new back will be 2 and then it will compare 
            if(front!=back){
                return false;
            }
        }
        return true;
    }
}