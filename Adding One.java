class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        //reducing redundancy code
        /* logic is if curr digit (starting from last) is less than 9 then add 1 to it
            and add all digits of arr to ans 
            nd return it;
        */
        /* if it is '9', then make that digit as 0 nd proceed for next
           if entire loop iteration is completed,
           then it indicates all r 9's
           so, add 1 to ans nd copy all other digits
        */
        Vector<Integer> ans=new Vector<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                for(int j=0;j<n;j++){
                    ans.add(arr[j]);
                }
                return ans;
            }
            arr[i]=0;
        }
        /* if came outside loop means it has all 9's
          so, add 1 to ans nd then other digits, i.e., 0 */
          ans.add(1);
          for(int i=0;i<n;i++){
              ans.add(0);
          }
          return ans;
    }
}
