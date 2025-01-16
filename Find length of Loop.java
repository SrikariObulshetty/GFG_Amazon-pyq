class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        if(head==null || head.next==null){
            return 0;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null || fast.next==null){  //no loop
            return 0;
        }
        int cnt=1;
        slow=slow.next;
        while(slow!=fast){
            cnt++;
            slow=slow.next;
        }
        return cnt; // loop doesn't exist
    }
}
