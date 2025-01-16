/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        if(head1==null || head2==null){
            return 0;
        }
        HashSet<Integer>set=new HashSet<>();
        Node ptr=head1;
        while(ptr!=null){
            set.add(x-ptr.data);
            ptr=ptr.next;
        }
        ptr=head2;
        int count=0;
        while(ptr!=null){
            if(set.contains(ptr.data)){
                count++;
            }
            ptr=ptr.next;
        }
        return count;
    }
}
