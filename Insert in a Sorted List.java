class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node naya=new Node(key);
        Node ptr=head;
        if(head==null){
            return naya; // only node present
        }
        if(head.data >=key){
            naya.next=head;
            return naya;
        }
        Node prev=null;
        while(ptr!=null && ptr.data<=key){
           prev=ptr;
            ptr=ptr.next;
        
        }
        prev.next=naya;
        naya.next=ptr;
        
        return head;
    }
}
