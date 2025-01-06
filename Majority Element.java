class Solution {
    static int majorityElement(int arr[]) {
        // Moore's voting algorithm
        int ele=arr[0],count=1;
        for(int i=1;i<arr.length;i++){
            if(count==0){
                ele=arr[i];
                count=1;
            }
            else if(arr[i]==ele){
                 count++;
             }
            else {
                 count--;
             }
        }
        count=0;
        // cross checking if the most freq occured ele is majority or not
        for(int n:arr){
            if(n==ele){
                count++;
            }
        }
        if(count > (arr.length)/2){
            return ele;
        }
       return -1;
        
        
    }
}
