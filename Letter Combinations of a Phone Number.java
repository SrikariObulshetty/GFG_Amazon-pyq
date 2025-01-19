class Solution {
    public static void letterComb(HashMap<Character,String>map, String digits,List<String>ans,int d_idx,StringBuilder sb){
        if(d_idx==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String k=map.get(digits.charAt(d_idx));
        for(char c:k.toCharArray()){
            letterComb(map,digits,ans,d_idx+1,sb.append(c));
            sb.deleteCharAt(sb.length()-1); // removing last added character while backtracking
          }  
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){ // Edge Case:
            return new ArrayList<>();
        }
          HashMap<Character,String>map=new HashMap<>();
           map.put('2',"abc");
           map.put('3',"def");
           map.put('4',"ghi");
           map.put('5',"jkl");
           map.put('6',"mno");
           map.put('7',"pqrs");
           map.put('8',"tuv");
           map.put('9',"wxyz");
           List<String>ans=new ArrayList<>();
           StringBuilder sb=new StringBuilder();
           letterComb(map,digits,ans,0,sb);
           if(ans.get(0).equals("")){
                  return new ArrayList<>();
           } 
           return ans;
    }
}
