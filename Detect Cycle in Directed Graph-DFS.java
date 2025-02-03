class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>>adj, int vis[], int pathVis[], int node){
        vis[node]=1;
        pathVis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0 && dfs(adj, vis,pathVis,nbr)==true){
                return true;
            }
            else if(pathVis[nbr]==1){
                return true;// cycle exists
            }
        }
        pathVis[node]=0; // backtracking
        return false;
        
        
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        // DFS
        int vis[]=new int[V];
        int pathVis[]=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0 && dfs(adj,vis, pathVis,i)==true){ // if dfs is true
                return true;    // then cycle exists
            }
        }
        return false;
        
    }
}
