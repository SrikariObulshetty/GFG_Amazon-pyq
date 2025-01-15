class Solution {
    boolean isCircular(Node head) {
        // Your code here
        Node ptr=head;
        if(head.next==null){
             return false;
        }
        while(ptr!=null){
            ptr=ptr.next;
            if(ptr==head){
                return true;
            }
        }
        return false;
    }
}
