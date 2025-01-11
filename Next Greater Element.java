class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()>0){
                ans.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
        
    }
}
  
