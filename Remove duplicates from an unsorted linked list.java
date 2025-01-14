class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        HashSet<Integer>set=new HashSet<>();
        Node ptr=head;
        Node prev=null;
        while(ptr!=null){
            if(set.contains(ptr.data)){
                prev.next=ptr.next;
            }
            else{
                prev=ptr;
            }
            set.add(ptr.data);
            ptr=ptr.next;
            
        }
        return head;
        
    }
}
