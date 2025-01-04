class Solution {
    public static int binSearch(int []arr, int k, int l, int h, int idx){
        if(l>h){ //overlapping so finished checking in entire array
            return idx;
        }
        int mid=(l + h)/2;
        if(arr[mid] > k){
            return binSearch(arr,k,l,mid-1,idx);
        }
        else if(arr[mid]<k){
            return binSearch(arr, k,mid+1,h, idx);
        }
        else{ //equal so store idx nd search for smaller one
             return binSearch(arr,k,l,mid-1,mid);
        }
    }
    public int binarysearch(int[] arr, int k) {
        // If there are multiple indices then we need to store the ans nd check for others if any more are there or not
       return binSearch(arr,k,0,arr.length-1,-1);
    }
}
