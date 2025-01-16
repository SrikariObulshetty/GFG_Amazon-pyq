class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1; // for easy handling purpose
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }
            else if(map.containsKey(sum)){
                //update max if needed
                max=Math.max(max, i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
