class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        // Write your code here.
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                pq.offer(arr[i][j]);
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        while(pq.size()!=0){
            list.add(pq.poll());
        }
        return list;
        
        
    }
}
