/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null) return null;
        ListNode dummy=new ListNode (0);
        dummy.next = head;
        ListNode curr =dummy;
        ListNode prev=dummy;
        int counter=0;
         while(prev!=null)
         {
             prev=prev.next;
             counter++;
         }
        for (int i=1;i<counter-n;i++)
        {
          curr=curr.next;
        }
        if(curr.next.next==null)
        {
            curr.next=null;
        }
        else
        {
            curr=curr.next;
            curr.val=curr.next.val;
            curr.next = curr.next.next;
        }
        return dummy.next;
    }
}
