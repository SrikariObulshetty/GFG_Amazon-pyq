class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        int n=s.length();
        int i=0;
        int j=0;
        int len=0;
        int arr[]=new int[26]; // for storing indices of chars
        Arrays.fill(arr, -1);
        if(n==1){
            return 1;
        }
        for(i=0;i<n;i++){
            char c=s.charAt(i);
            int fre=arr[c-'a'];
            if( (fre>=j && fre<i) ){ // that idx is already present
                len=Math.max(len, i-j);
                arr[c-'a']=i;
                j=fre+1;
            }
            else{
                arr[c-'a']=i;
            }
            
        }
        len=Math.max(len, i-j);
        return len;
    }
}
