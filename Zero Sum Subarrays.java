class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int n:arr){
            sum+=n;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
