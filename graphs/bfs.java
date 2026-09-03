import java.util.*;
import java.util.List;
public class Solution {
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        // Write your code here
        List<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n];

        vis[0]=true;
        q.add(0);

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}

