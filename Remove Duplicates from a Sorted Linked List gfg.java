class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        if(head==null || head.next==null){  //only one node is present ,no dup
              return head;
        }
        Node i=head;
        Node j=head;
        while(j!=null){
            if(i.data==j.data){ //duplicate
                j=j.next;
            }
            else{
                i.next=j;
                i=j;
                j=j.next;
            }
        }
        i.next=j;
        return head;
        
    }
}
