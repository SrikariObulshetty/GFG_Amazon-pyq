
/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head.next==null){ //only one node
            return null;
        }
        Node prev=null;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){ //this condin is important check it properly
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
        
    }
}
