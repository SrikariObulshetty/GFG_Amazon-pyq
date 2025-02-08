class Solution {
    static int maxAmount(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq= new PriorityQueue<>( (a,b) -> b-a);
        for(int m:arr){
            pq.offer(m);
        }
        long max=0;
        while(k>0 && pq.size() > 0){
            k--;
            max+=pq.peek();
            pq.offer( pq.poll() - 1);
        }
        int div= (int) Math.pow(10, 9) + 7;
        return (int) (max % div);
    }
}
