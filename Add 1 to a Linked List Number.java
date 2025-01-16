
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        Node newHead=reverse(head);//reversing linked list
        int carry=1;
        Node ptr=newHead;
        Node tmp=newHead;
        while(carry!=0 && ptr!=null){
            int ele=ptr.data+carry;
            ptr.data=ele%10;
            carry=ele/10;
            ptr=ptr.next;
        }
        Node fin=reverse(newHead); //again revrsing back
        if(carry==1){ // if still carry is present, then new Node should be created
            Node naya=new Node(1);
            naya.next=fin;
            return naya;
        }
        return fin;
        
    }
}
