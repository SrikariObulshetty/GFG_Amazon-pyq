class Solution {
    public static int getMissing(int []arr, int l){ 
        int n=arr.length;
        int len=n-l;
        for(int i=l;i<n;i++){
            int val=Math.abs(arr[i])+l-1;
            if(val<n && arr[val]>0){
                arr[val]=-arr[val];
            }
        }
        //iterate over this part of array nd if we find pos anywhere that is missing positive
        for(int i=l;i<n;i++){
            if(arr[i]>0){
                return i-l+1;
            }
        }
        return n-l+1;
    }
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        //segregate num into neg on left side nd pos on ryt side
        int n=arr.length;
        if(n==1 && arr[0]<=0){
            return 1;
        }
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]<=0){ // swap it to left
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 i++;
            }
        }
        if(i==n){ //all are neg's or 0,so return 1;
            return 1;
        }
        return getMissing(arr,i);
    }
}
