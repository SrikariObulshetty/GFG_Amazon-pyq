class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2) {
        // Your code here
        int l1=s1.length();
        int l2=s2.length();
        if(l1==1 && l2==1){
            if(s1.charAt(0)==s2.charAt(0)){
                 return true;
            }
            return false;
        }
        if(l1!=l2){ //if string len's are not equal, then no chance of getting s2 from s1
            return false;
        }
        boolean left=true;
        for(int i=0;i<l1;i++){
             if(s1.charAt(i)!=s2.charAt( (i+2)%l1)){ //condin for  ryt rotation
                  left=false;
                  break;
             }
        }
        boolean ryt=true;
        for(int i=0;i<l2;i++){
            if(s1.charAt(i)!=s2.charAt( (i-2+l1)%l1)){ //condin for  left rotation
                  ryt=false;
                  break;
             }
        }
        return ryt || left;
    }
}
