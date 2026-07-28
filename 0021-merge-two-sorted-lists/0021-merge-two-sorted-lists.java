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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode dummy = new ListNode(0);
       ListNode curr= dummy ;
       while(list1!=null && list2!= null){
        if(list1.val<=list2.val){
            curr.next = list1;// move dummy to list1
            list1=list1.next;// mover list1 ahead to .next
        }else{
            curr.next = list2;
            list2= list2.next;
        }
        curr = curr.next; // let curr move hence curr = curr.next
       }// for handling those case where our loop breaks when either list1 or list2 = null so we will then just add the next element of the remaing list as it is as its an sorted list 
       curr.next =list1!=null ? list1 : list2;// is L1 is nul or L2 
       return dummy.next;  // .next cause it starts with 0 and 0 is not part of the list and return dummy not curr as curr moves with the merge but dummy dosent move 
    }
}