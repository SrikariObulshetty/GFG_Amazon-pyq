/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
  
    public static Node reverseKGroup(Node head, int k) {
         if(head==null || head.next==null){
             return head;
         }
         Node temp=head;
         Node kthNode=head; // to hold kth node if available
         Node next=null; // to hold next of k node for next 'k' grp
         int cnt=k-1;
         while(cnt!=0){
             cnt--;
             kthNode=kthNode.next;
             if(kthNode==null){
                 break;
             }
         }
         if(kthNode!=null){
             next=kthNode.next;
             kthNode.next=null;
         }
         
         Node newHead=reverse(head);
         if(next!=null){
             head.next=reverseKGroup(next,k); // always the curr head will be last
             // node after reversing, so next node should be attached to
             // head.next;
         }
         

        return newHead; // this new Head will be at front, so return this
    }
    
}
