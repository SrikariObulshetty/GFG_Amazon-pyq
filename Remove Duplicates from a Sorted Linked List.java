class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        int cnt=k;
        Node i=head;
        while(cnt!=0 && i!=null){
            i=i.next;
            cnt--;
        }
        if(i==null){
            if(cnt!=0){ //implies k is more than no.of nodes
                return -1;
            }
            return head.data;// if cnt==0 nd i==null, implies asked first node
        }
        Node j=head;
        while(i!=null){
            i=i.next;
            j=j.next;
        }
        return j.data;
        
    }
}
