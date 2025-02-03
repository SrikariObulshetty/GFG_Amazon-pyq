class Solution {
    public static int[] calculate(ArrayList<ArrayList<Integer>>adj){
        int n=adj.size();
        int indegree[]=new int[n];
        for(ArrayList<Integer> v:adj){
            for(int k:v){
                indegree[k]++;
            }
        }
        return indegree;
    }
    
    public static int kahnsAlgo(ArrayList<ArrayList<Integer>>adj, int []indegree, int V){
        int count=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        while(q.size() > 0){
            int vtx=q.poll();
            count++;
            for(int nbr:adj.get(vtx)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        return count;
    }
    
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        // BFS
        // logic is if it has cycle, then we can't do topo Sort for all nodes
        int indegree[]=calculate(adj);
        int count=kahnsAlgo(adj, indegree,V);
        return (count==V)?false : true;
        
    }
}
