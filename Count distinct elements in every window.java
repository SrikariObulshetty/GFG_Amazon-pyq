class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int i=0;
        int j=0;
        for(;j<k;j++){
            map.put(arr[j], map.getOrDefault(arr[j], 0) +1);
        }
        ans.add(map.size());
        for(;j<n;j++){
            map.put(arr[j],map.getOrDefault(arr[j],0) +1);
            map.put(arr[i], map.get(arr[i]) -1);
            if(map.get(arr[i]) ==0){ // if val becomes '0', indicates that ele is not in 
                map.remove(arr[i]); // this window
            }
            i++;
            ans.add(map.size());
        }
        return ans;
    }
}
