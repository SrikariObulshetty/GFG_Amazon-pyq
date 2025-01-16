class Solution {

    public int towerOfHanoi(int n, int src, int dest, int helper) {
        // Your code here
        if(n==0){
            return 0;
        }
        int val=towerOfHanoi(n-1,src,dest,helper);
        return val+1+towerOfHanoi(n-1,helper,src,dest);
        
    }
}
