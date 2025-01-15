class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        int cnt=1;
        Node ptr=head;
        Node prev=head;
        while(ptr!=null){
            if( (cnt%2)==0 ){ //node at even position
                prev.next=ptr.next;
                prev=prev.next;
            }
            cnt++;
            ptr=ptr.next;
        }
        //see solution , it is a bit logical using nodes nd not count variable;
    }
}
