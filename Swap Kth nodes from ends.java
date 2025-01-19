class Solution {
    public static int findLength(Node head){
         int cnt=0;
         Node ptr=head;
         while(ptr!=null){
             cnt++;
             ptr=ptr.next;
         }
         return cnt;
    }
    public Node swapKthNode(Node head, int k) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        int l=findLength(head);
        if(k>l || (l%2!=0 && k==(l/2)+1) ){ //if l is odd
           // nd k is middle node, no need to swap 
           // to check if k is  middle node or not, 
           // use formula: 2*k-1==l;
           return head;
        }
        int cnt=0;
        Node i=head;
        Node i_prev=null;
        Node j=head;
        Node j_prev=null;
        while(cnt!=k-1){ //placing i  at kth node from start
            i_prev=i;
            i=i.next;
            cnt++;
        }
        cnt=l-k;
        while(cnt!=0){ // placing j at kth node from end
            j_prev=j;
            j=j.next;
            cnt--;
        }
        if(i_prev!=null){
            i_prev.next=j;
        }
        if(j_prev!=null){
            j_prev.next=i;
        }
        Node tmp=i.next;
        i.next=j.next;
        j.next=tmp;
        if(k==1){
            return j;
        }
        if(k==l){
            return i;
        }
        return head;
        
        
    }
}
