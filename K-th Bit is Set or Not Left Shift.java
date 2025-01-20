
class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        // LEFT SHIFT
        int num=1<<k; // in num only at kth position
        // bit is 1
        if( (n & num)!=0 ){
            return true;
        }
        return false; 
        
    }
}


            if (obj.checkKthBit(n, k))
                System.out.println("true"); // If true, print Yes

            else
                System.out.println("false"); // Else print No

            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
