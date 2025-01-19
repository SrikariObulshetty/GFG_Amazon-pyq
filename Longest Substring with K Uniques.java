class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int l=s.length();
        if(l<k){
            return -1;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int max=-1;
        for(int j=0;j<l;j++){
             char c=s.charAt(j);
             map.put(c, map.getOrDefault(c,0)+1 );
              if(map.size()>=k){
                 while(map.size()>k){
                     char p=s.charAt(i);
                     map.put(p, map.get(p)-1 );
                     i++;
                     if(map.get(p)==0){
                         map.remove(p);
                     }
                 }
                 max=Math.max(max, j-i+1);
             }
        }
        if(map.size()==k){
            max=Math.max(max, l-i);
        }
        return max;
    }
}
