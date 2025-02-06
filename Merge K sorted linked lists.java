/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node>pq=new PriorityQueue<>( (a,b) -> a.data-b.data);
        int n=arr.size();
        for(int i=0;i<n;i++){
            pq.offer(arr.get(i));// adding all heads of list
        }
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(pq.size() > 0){
            Node top=pq.poll();
            if(top.next!=null){
                pq.add(top.next);
            }
            temp.next=top;
            temp=top;
        }
        return dummy.next;
        
    }
}
