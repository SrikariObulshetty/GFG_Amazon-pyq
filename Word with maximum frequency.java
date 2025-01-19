
class Solution {
    public String maximumFrequency(String str) {
        // Your Code goes here
        HashMap<String,Integer>map=new LinkedHashMap<>();
        String arr[]=str.split(" ");
        String ans="";
        int max=0;
        for(int j=0;j<arr.length;j++){
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
        }
        for(String s:map.keySet()){
            if(map.get(s) > max){
                max=map.get(s);
                ans=s;
            }
        }
        return ans+" "+max;
    }
}


