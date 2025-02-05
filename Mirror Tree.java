class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    public Node mirroring(Node node){
        if(node==null){
            return null;
        }
        Node left=node.left;
        Node right=node.right;
        node.left=mirroring(right);
        node.right=mirroring(left);
        return node;
    }
    void mirror(Node node) {
        // Your code here
        if(node==null){
            return;
        }
        mirroring(node);
    }
}
