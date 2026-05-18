// Link - https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/


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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode i=head;
        ListNode j=i.next;

        while(j!=null)
        {
            if(j.val!=i.val){
                i.next=j;
                i=i.next;
            }
            j=j.next;
        }
        i.next=null;
        
        return head;
    }
}



// --------------------------------------------------------------------------------------


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next node
            }
        }
        
        return head;
    }
}
