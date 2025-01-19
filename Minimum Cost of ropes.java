class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public int minCost(int[] arr) {
        if(arr.length==1){
            return 0; // cost is zero
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(); // default type is min heap
        int cost=0;
        for(int n:arr){
            pq.offer(n);
        }
        while(pq.size()!=1){
            int tmp=pq.poll();
            tmp+=pq.poll();
            pq.offer(tmp);
            cost+=tmp;
        }
        return cost;
        
    }
}
