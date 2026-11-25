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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode p=head;
        while(p!=null){
            count++;
            p=p.next;
        } 
        if(count==n){
            return head.next;
        }
        ListNode q=head;
        for(int i=1;i<count-n;i++){
            q=q.next;
        }
        q.next=q.next.next;
        return head;
        }
}