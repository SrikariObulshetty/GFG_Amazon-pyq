class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n=arr.length;
        //find max in array
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
        }
        if(k==n){
            return max;
        }
        //prepare frequncy array
        int freq[]=new int[max+1];
        //update in freq array
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        //check for kth smallest by traversing in freq array
        for(int i=0;i<=max;i++){
                k=k-freq[i];
                if(k<=0){ //understand y this condin
                    return i;
                }
        }
        return -1;
    }
}
