class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newNode=new Node(data);
        Node ptr=head;
        //Case 1: inserting into empty list
        if(head==null){
            return newNode;
        }
        //Case 2: insert before head
        if(head.data>=data){
            newNode.next=head;
            while(ptr.next!=head){
                ptr=ptr.next;
            }
            ptr.next=newNode;
            return newNode;
        }
        //Case 3: inserting in middle or end
        while(ptr.next!=head && ptr.next.data<=data){
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
        return head;
    }
}
