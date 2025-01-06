class Solution {
    public static boolean cmp(char top, char curr){
         if ( (curr==')') && (top!='(') ) return false;
         if ( (curr==']') && (top!='[') ) return false;
         if ( (curr=='}')  && (top!='{') ) return false;
         return true;
          
         
    }
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{ // any closing bracket
               /* if(st.isEmpty()==true){ //no corresponding open bracket
                    return false;
                }
                else if( (c==')' && st.peek()!='(') || (c==']' && st.peek()!='[') || (c=='}' && st.peek()!='{')){
                    return false; // brackets are not in proper order
                }
                st.pop(); */
                if(st.isEmpty()==true || cmp(st.peek(),c)==false){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
