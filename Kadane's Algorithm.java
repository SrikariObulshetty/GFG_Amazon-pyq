class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // If asked for indices also,then take st, ans_st, ans_end also , then update by thinking
        if(arr.length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int n:arr){
            sum+=n;
            max=Math.max(sum, max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
