import java.util.*;

public class Solution
{
    public static void dfs(int row,int col, int[][]ans, int[][] image,int inicol,int newcol,int []delrow, int[] delcol){
        ans[row][col]=newcol;
        int n=ans.length;
        int m =ans[0].length;

        for(int i=0; i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicol && ans[nrow][ncol]!=newcol)
            {
                dfs(nrow,ncol,ans,image,inicol,newcol,delrow,delcol);
            }
        }
    }

    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int inicol=image[x][y];

        if (inicol == newColor) {
            return image;
        } 

        int ans[][]=image;

        int delrow[]={-1,0,+1,0};
        int delcol[]={0,1,0,-1};
        dfs(x,y,ans,image,inicol,newColor,delrow,delcol) ;
        return ans;
   }
}

