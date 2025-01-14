class Solution {
    void deleteNode(Node node) {
        // Your code here
        //copying the data
        Node ptr=node;
        ptr.data=node.next.data; // node.next will not be null, given in que
        ptr.next=ptr.next.next;
        
    }
}
