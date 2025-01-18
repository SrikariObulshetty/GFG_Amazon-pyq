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
    public static int findLength(ListNode head){
        int cnt=0;
        ListNode ptr=head;
        while(ptr!=null){
            cnt++;
            ptr=ptr.next;
        }
        return cnt;
    }
    public ListNode rotateRight(ListNode head, int k) {
          if(head==null || head.next==null){
             return head; //wtever be value of k doesn't matter
          }
          int len=findLength(head);
          k=k%len;
          if(k==0){ 
              return head; // rotating list by multiples of length gives same list
          }

          ListNode newHead=null;
          ListNode tmp=head;
          ListNode prev=null;
          int cnt=len-k;
          while(cnt!=0){
             prev=tmp;
             tmp=tmp.next;
             cnt--;
          }
          newHead=tmp;
          prev.next=null;
          while(tmp.next!=null){
             tmp=tmp.next;
          }
          tmp.next=head;
          return newHead;


    }
}
