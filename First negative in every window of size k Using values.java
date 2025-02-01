
class Solution {

    // Function to find the first negative integer in every window of size k
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        // write code here
        List<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>(); // to store indices not elements
        int i=0,j=0;
        int n=arr.length;
        while(j<k){
           if(arr[j]<0){
               q.offer(arr[j]);
           }
           j++;
        }
        if(q.isEmpty()){
            ans.add(0);
        }
        else{
            ans.add(q.peek());
            if(q.peek()==arr[i]) q.poll();
        }
        i++;
        while(j<n){
           if(arr[j]<0){
               q.offer(arr[j]);
           }
           if(q.isEmpty()){
               ans.add(0);
           }
           else{
               ans.add(q.peek());
               if(q.peek()==arr[i]) q.poll();
           }
           j++;
           i++;
        }
        return ans;
    }
}

//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            List<Integer> ans = ob.FirstNegativeInteger(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

