class Solution {
    Node divide(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node d_odd=new Node(0); //points to head of odd link list
        Node d_even=new Node(0); // points to head of even link list
        
        Node d1=d_odd;
        Node d2=d_even;
        Node tmp=head;
        while(tmp!=null){
            if( (tmp.data%2) ==0){ //attach to even link list
                 d1.next=tmp;
                 d1=d1.next;
            }
            else{
                d2.next=tmp;
                d2=d2.next;
            }
            tmp=tmp.next;
        }
        
        d1.next=d_even.next;
        d2.next=null; //this points to last node if total nodes is odd
        return d_odd.next;
        
    }
}
