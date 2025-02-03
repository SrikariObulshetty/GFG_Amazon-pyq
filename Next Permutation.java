class Solution {
    public static void reverse(int nums[], int l, int h){
        while(l<h){
            //swap
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }
    void nextPermutation(int[] nums) {
        // code here
        int n=nums.length;
        int i=n-1;
        int j=n-1;
        for(; i>0;i--){
            if(nums[i] > nums[i-1]){
                break;
            }
        }
        if(i==0){ // arr is in descending order, so need to sort it
            reverse(nums, 0, n-1);
            return;
        }
        // find num which is just grter than nums[i-1] from i
        for(; j>=i;j--){ //j>=i && not j>i
            if(nums[j] > nums[i-1]){
                break;
            }
        }
        // swap
        int tmp=nums[i-1];
        nums[i-1]=nums[j];
        nums[j]=tmp;
        reverse(nums, i, n-1);
