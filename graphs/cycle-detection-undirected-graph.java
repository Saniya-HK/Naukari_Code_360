

import java.util.*;

class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}

class Solution {
    
    public static boolean checkCycle(int src,ArrayList<ArrayList<Integer>> adj, int vis[], int n ){
        vis[src]=1;
        Queue <Pair> q= new LinkedList<Pair> ();
        q.add(new Pair(src,-1));
        //Queue <int []> q= new LinkedList<> ();
        // q.add(new int[]{src,-1});

        
        while(!q.isEmpty()){
            Pair p = q.poll();
            
            int node = p.first;
            int parent = p.second;

            // int[] top = q.peek();
            // int node = top[0];
            // int parent=top[1];
            
            
            
            for(int adjNode: adj.get(node)){
                if(vis[adjNode]==0){
                    vis[adjNode]=1;
                    q.add(new Pair(adjNode,node));
                    //q.add(new int[]{adjNode,node});
                }
                else if(adjNode!=parent){
                    return true;
                }
            }
        }
        return false;
        
    }

    public static String cycleDetection(int[][] edges, int n, int m) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            
             adj.get(u).add(v);
             adj.get(v).add(u);
        }
        
        int vis[] = new int[n+1];
        
        for(int i=1; i<n;i++){
            if(vis[i]==0){
                if(checkCycle(i,adj,vis,n)) {
                   return "Yes";
                }
            }
        }
        return "No"; 
        
    }
}
