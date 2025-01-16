
class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node i=head;
        Node j=head.next;
        int cnt=1;
        while(j!=null){
            if(i.data==j.data){
                cnt++;
            }
            else{ //data not equal
                if(cnt==1){ // 'i' node should not be removed 
                   prev=i;
                   i=j;
                }
                else{ // 'i' should be removed 
                    if(prev==null || prev==i){ //change the head
                        head=j;
                        prev=j;
                        i=j;
                    }
                    else{ 
                        prev.next=j;
                        i=j;
                    }
                }
                cnt=1;
            }
            j=j.next;
        }
        if(cnt!=1){
            if(prev==null){
                return null;
            }
            prev.next=null;
        }
        return head;
    }
}
