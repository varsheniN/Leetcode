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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode mark=dummy,prev=null,curr=head,follow=null;
        for(int i=1;i<m;i++){
            mark=curr;
            curr=curr.next;
        }
        for(int j=1;j<n-m+1;j++){
            follow=curr.next;
            curr.next=prev;
            prev=curr;
            curr=follow;
        }
        mark.next.next=curr.next;
        curr.next=prev;
        mark.next=curr;
        return dummy.next;
    }
}