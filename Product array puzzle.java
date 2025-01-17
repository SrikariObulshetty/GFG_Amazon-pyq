class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int zero=0;
        int prod=1;
        int n=arr.length;
        int res[]=new int[n];
        for(int k:arr){
            if(k==0){
                zero++;
                continue;
            }
            prod*=k;
        }
        if(zero>1){
            return res; //default values are 0's only na 
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                res[i]=prod;
            }
            else if(zero==1){
                res[i]=0;
            }
            else{
                res[i]=(prod/arr[i]);
            }
        }
        return res;
    }
}
