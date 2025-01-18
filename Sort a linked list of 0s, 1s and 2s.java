//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        Node d0=new Node(0);
        Node d1=new Node(1);
        Node d2=new Node(2);
        Node t0=d0;
        Node t1=d1;
        Node t2=d2;
        Node tmp=head;
        while(tmp!=null){
            if(tmp.data==0){
                t0.next=tmp;
                t0=t0.next;
            }
            else if(tmp.data==1){
                t1.next=tmp;
                t1=tmp;
            }
            else{ //tmp.data==2
                t2.next=tmp;
                t2=tmp;
            }
            tmp=tmp.next;
        }
        t0.next=(d1.next!=null) ? d1.next:d2.next;
        t1.next=d2.next;
        t2.next=null; // imp condition o.w will get circular
        return d0.next;
        
    }
}


