class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int k:arr){
            map.put(k, map.getOrDefault(k,0)+1);
        }
        // checking if values of any two keys r same 
        // by using map.containsValue(value)
        for(int key:map.keySet()){
             if(set.contains(map.get(key))){
                 return false;
             }
             set.add(map.get(key));
        }
        return true;
    }
}
        
