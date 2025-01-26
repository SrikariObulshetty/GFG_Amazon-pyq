class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(fast==slow){ //loop
                 break;
             }
        }
        if(fast==null || fast.next==null){ //no loop
             return;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        fast=fast.next;
        while(fast.next!=slow){
             fast=fast.next;
        }
        fast.next=null;
        
        
    }
}
