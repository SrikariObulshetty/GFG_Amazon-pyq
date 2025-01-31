class Solution {

    int search(String pat, String txt) {
        // code here
        int pt[]=new int[26];
        int freq[]=new int[26];
        int count=0;
        int l=pat.length();
        int n=txt.length();
        for(int i=0;i<l;i++){
             char c1=pat.charAt(i); 
             char c2=txt.charAt(i);
             pt[c1-'a']++; // updating freq's of first pat length 
             freq[c2-'a']++;  // elements in both pt array nd freq array
        }
        if(Arrays.equals(pt,freq) ){ // comparing pt and freq arrays
            count++;
        }
        for(int i=0;i<l;i++){
            char c=pat.charAt(i);
        }   
        
        for(int i=l;i<n;i++){
            char c=txt.charAt(i);
            char m=txt.charAt(i-l);
            freq[c-'a']++; // don't use c nd m directly coz we're taking
            freq[m-'a']--; // only 26 array size, if we take 256 then we can do so
            if(Arrays.equals(pt,freq) ){ //checks id both arrays have same values
                count++;     // at all indices 
            }
            
        }
        return count;
        
        
    }
}
