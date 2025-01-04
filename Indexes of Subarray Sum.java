class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int sum=0;
        int i=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            while(sum>target && i<=j){ //until sum is less or equal incrment i ptr
                    sum-=arr[i];
                    i++;
                }
            if(sum==target){ 
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
            //if sum is less then add next idx sum
        }
        ans.add(-1);
        return ans;
    }
}
