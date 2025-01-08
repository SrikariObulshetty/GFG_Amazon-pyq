class Solution {
    public static void recursion(char arr[], int idx,HashSet<String>ans ){
        //base case
        if(idx==arr.length){ //ptr moved outside the array
              ans.add(new String(arr));
               return;
        }
        //swaaping elements idx with idx->n-1
        for(int i=idx;i<arr.length;i++){
            char temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
            recursion(arr, idx+1, ans);
            //swapping back
            temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
        
    }
    public List<String> findPermutation(String s) {
        // using recursioj nd no any extra space other than recursive calls
        //we swap evry ele from its idx to (n-1)
        
        char arr[]=s.toCharArray();
        //Arrays.sort(arr);//even if we sort now i hashset order will be lost so sort at last
        HashSet<String>ans=new HashSet<>();
        ArrayList<String>ans2=new ArrayList<>();
        recursion(arr,0,ans);
        for(String n:ans){
            ans2.add(n);
        }
        Collections.sort(ans2);
        return ans2;
        
    }
}
