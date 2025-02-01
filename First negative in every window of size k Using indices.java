class Solution {
    public boolean isArraySpecial(int[] nums) {
         int n=nums.length;
         if(n==1){
            return true;
         }
         int i=0, j=1;
         while(j<n){
            int e1=nums[i];
            int e2=nums[j];
           /* if( (e1%2==0 && e2%2==0) || (e1%2!=0 && e2%2!=0) ){
                return false;
            } */
            // even more better form of writing is below
            if(e1%2==e2%2){
                return false;
            }

            i++;
            j++;
         }
         return true;
    }
}
