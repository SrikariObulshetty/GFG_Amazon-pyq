
class Solution {
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next; //holding next ptr
            curr.next=prev; // pointing curr to prev
            prev=curr; // updating prev
            curr=next; // updating current
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        while(num1.data==0){
            num1=num1.next;
        }
        while(num2.data==0){
            num2=num2.next;
        }
        Node tail1=reverse(num1);
        Node tail2=reverse(num2);
        Node head=null;
        Node d=head;
        int carry=0;
        while(tail1!=null || tail2!=null || carry!=0){
              int sum=0;
              if(tail1!=null){
                  sum+=tail1.data;
                  tail1=tail1.next;
              }
              if(tail2!=null){
                  sum+=tail2.data;
                  tail2=tail2.next;
              }
              sum+=carry;
              Node newNode=new Node(sum%10);
              newNode.next=head;
              head=newNode;
              carry=sum/10;
        }
        while(head!=null && head.data==0){
            head=head.next;
        }
        if(head==null){ // sum is 0;
            return new Node(0);
        }
        return head;
    }
}

