import java.util.*;

public class Solution {
    public static int findNumOfProvinces(int[][] roads, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        for (int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                if(roads[i-1][j-1]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int vis[] = new int[n+1];
        int cnt=0;

        for (int i=1; i<=n;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
    }

    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj, int vis[] ){
        vis[node]=1;

        for(Integer it: adj.get(node)){
            if(vis[it]==0){
                dfs(it,adj,vis);
            }
        }
    }
}
