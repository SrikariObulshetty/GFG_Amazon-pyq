class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
             sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            max=Math.max(sum, max);
        }
        return max;
        
    }
}
