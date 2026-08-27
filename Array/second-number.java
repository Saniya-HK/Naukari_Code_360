import java.util.*;

public class Solution {
    public static int[] getSecondOrderElements(int n, int []arr) {
        // Write your code here.
        int largest=arr[0];
        int second[]=new int[2];
        int smallest=arr[0];
        second[0]=Integer.MIN_VALUE;
        second[1] = Integer.MAX_VALUE;

        for (int i=1; i<n;i++){
            if (arr[i]>largest){
                second[0]=largest;
                largest=arr[i];
            }
            else if (arr[i]>second[0] && arr[i]<largest)
            {
                second[0]=arr[i];
            }
            if (arr[i]<smallest){
                second[1]=smallest;
                smallest=arr[i];
            }
            else if (arr[i]<second[1] && arr[i]>smallest)
            {
                second[1]=arr[i];
            }
        }
        return second;
    }
}
