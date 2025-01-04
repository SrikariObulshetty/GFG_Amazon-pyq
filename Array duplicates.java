class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();// no need of linked hashmap
        for(int n:arr){
            if(map.containsKey(n)){
                if(map.get(n)>0){
                    ans.add(n);
                    map.put(n,Integer.MIN_VALUE);
                }
            }
            else{
                map.put(n,1);
            }
        }
        return ans;
    }
}
