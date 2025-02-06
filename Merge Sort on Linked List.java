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
class Solution {
    public static Node merge(Node h1, Node h2){
        if(h1==null){
            return h2;
        }
        else if(h2==null){
            return h1;
        }
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(h1!=null && h2!=null){
            if(h1.data > h2.data){
                temp.next=h2;
                temp=h2;
                h2=h2.next;
            }
            else {
                temp.next=h1;
                temp=h1;
                h1=h1.next;
            }
        }
        if(h1==null){
            temp.next=h2;
        }
        else if(h2==null){
            temp.next=h1;
        }
        return dummy.next;
        
    }
    public static Node  mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // finding middle point
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next==null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // splitting list into two parts;
        fast=slow.next;
        slow.next=null;
        Node left=mergesort(head);
        Node ryt=mergesort(fast);
        head=merge(left, ryt);
        return head;
    }
    
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        // add your code here
        return mergesort(head);        
    }
}

 }
}
