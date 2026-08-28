import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        long sn=(long) n*(n+1)/2;
        long sn2=(long) n*(n+1)*(2*n+1)/6;
        long s=0;
        long s2=0;
        for (int i=0; i<n;i++){
            s=s+arr.get(i);
            s2=s2+(long) arr.get(i)*arr.get(i);
        }
        long v1=sn-s;
        long v2 = sn2-s2;
        v2=v2/v1;
        long repeating = (v1+v2)/2;
        long missing =repeating-v1;

        return new int[]{ (int)repeating,(int)missing};

    }
}
