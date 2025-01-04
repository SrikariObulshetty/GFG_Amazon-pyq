class Solution {
    int missingNumber(int arr[]) {
        // code here
        long sum=0;
        int n=arr.length;
        for(int i:arr){
            
            sum+=i;
        }
        return (int)(((long)(n+1)*(n+2)/2)-sum);
    }
}
