class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(head==null || head.next==null || k==0){ //k==0, no rotation
            return head; // one or no node, any no.of rotations will not effect linked list 
        }
        Node curr=head;
        Node ptr=null;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head; // making list as circular 
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
}
