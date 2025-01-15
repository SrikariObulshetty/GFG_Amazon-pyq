/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect { 
    public static int findLength(Node head){
        int cnt=0;
        Node ptr=head;
        while(ptr!=null){
            cnt++;
            ptr=ptr.next;
        }
        return cnt;
    }
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        // code here
        int l1=findLength(head1);
        int l2=findLength(head2);
        int diff=Math.abs(l1-l2);
        if(l1>l2){ //move l1 by diff times
              for(int i=0;i<diff;i++){
                  head1=head1.next;
              }
        }
        else{
            for(int i=0;i<diff;i++){
                head2=head2.next;
            }
        }
        while(head1!=null){
             if(head1==head2){
                 return head1;
             }
             head1=head1.next;
             head2=head2.next;
        }
        return null;
        
    }
}
