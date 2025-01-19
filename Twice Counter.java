class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        int cnt=0;
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:list){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for(String s:map.keySet()){
            if(map.get(s)==2){
                cnt++;
            }
        }
        return cnt;
    }
}
