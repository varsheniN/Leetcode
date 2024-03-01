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
    public boolean isPalindrome(ListNode head) {
        List<Integer> ls=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            ls.add(curr.val);
            curr=curr.next;
        }
        int front=0;
        int back=ls.size()-1;
        while(front<back){
            if(!ls.get(front).equals(ls.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}