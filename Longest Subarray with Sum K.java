class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Long,Integer>map=new HashMap<>();
        //map.put(0l,-1); 
        long sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(sum==k){
                 max=i+1;
             }
             if(map.containsKey(sum-k)){ // then it means if we add 'k' to that prev sum
             // we got curr sum so from map.get(prev_sum) to this idx sum of  numbers will
             //be equal to k
                  max=Math.max(max, i-map.get(sum-k));
             }
             if(!map.containsKey(sum)){ // irrespective of  whether sum-k is present or not 
             // we have to add sum iff it deosn't exist in map already
             //if it exists then we should not change it bcoz it will fails in some test cases
             // understand all this condi's properly
                 map.put(sum, i);
             }
        }
        return max;  
    }
}
