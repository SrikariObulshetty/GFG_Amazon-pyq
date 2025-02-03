/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node==null){
            return -1; //give -1 here, not zero
        }
        int left=height(node.left);
        int ryt=height(node.right);
        
        return Math.max(left, ryt) +1 ;
    }
}
