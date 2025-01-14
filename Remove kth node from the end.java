class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1){
             return null;
        }
        ListNode j=head;
        while(j!=null && n!=0){
            j=j.next;
            n--;
        }
        if(j==null){
            return head.next; //
        }
        ListNode ptr=head;
        ListNode prev=null;
         while(j!=null){
            j=j.next;
            prev=ptr;
            ptr=ptr.next;
         }
         prev.next=ptr.next;
         return head;


    }
}
