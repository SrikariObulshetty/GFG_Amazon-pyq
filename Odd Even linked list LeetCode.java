class Solution {
    public ListNode oddEvenList(ListNode head) {
         if(head==null || head.next==null){ //only one node, no even odd parts
            return head;
         }
         ListNode d1=new ListNode(0);
         ListNode d2=new ListNode(0);
         ListNode de=d2;
         ListNode d_odd=d1;
         ListNode ptr=head;
         int cnt=1;
         while(ptr!=null){
             if( (cnt%2)==0 ){ //even
                  d2.next=ptr;
                  d2=d2.next;
             }
             else{
                d1.next=ptr;
                d1=d1.next;
             }
             cnt++;
             ptr=ptr.next;
         }
         d1.next=de.next;
         d2.next=null;
         return d_odd.next;

    }
}
