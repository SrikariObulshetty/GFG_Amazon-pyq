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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr=list1;
        int cnt=b-a+1;
           while(a!=1){
               ptr=ptr.next;
               a--;
           }
           ListNode tmp=ptr.next;
           ptr.next=list2;
           ptr=list2;
           while(ptr.next!=null){
              ptr=ptr.next;
           }
           while(cnt!=0){
              cnt--;
              tmp=tmp.next;
           }
           ptr.next=tmp;
           return list1;

    }
}
