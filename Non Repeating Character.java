class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        int arr[]=new int[26];
        Arrays.fill(arr,0); 
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0;i<l;i++){
            if(arr[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}
