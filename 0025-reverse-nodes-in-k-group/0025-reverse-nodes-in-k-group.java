
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while (true) {
            
            ListNode checker = prev;
            for (int i = 0; i < k; i++) {
                checker = checker.next;
                if (checker == null) {
                   
                    return dummy.next;
                }
            }

            ListNode start = prev.next;
            ListNode then = start.next;
            
            for (int i = 0; i < k - 1; i++) {
                start.next = then.next;
                then.next = prev.next;
                prev.next = then;
                then = start.next;
            }

            prev = start;
        }
    }
}