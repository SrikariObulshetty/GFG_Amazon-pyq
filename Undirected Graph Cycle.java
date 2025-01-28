class Solution {
    // Function to detect cycle in an undirected graph.
    public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int []vis, int parent[], int node){
          vis[node]=1;
          parent[node]=-1;
          Queue<Integer> q=new LinkedList<>();
          q.offer(node);
          while(q.size() > 0){
              int p=q.poll();
              for(int nbr: adj.get(p)){
                  if(vis[nbr]==0){
                      q.offer(nbr);
                      vis[nbr]=1;
                      parent[nbr]=p;
                  }
                  else if( parent[p] != nbr){
                      return true;
                  }
              }
          }
          return false;
    }
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n=adj.size();
        int vis[]=new int[n];
        int parent[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if( bfs(adj, vis, parent, i) ==true){ // if one component has cycle then ans is true
                    return true;
                }
            }
        }
        return false;
    }
}
