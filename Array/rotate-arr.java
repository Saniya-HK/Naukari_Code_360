import java.util.ArrayList;

public class Solution {
    public static void reverse(ArrayList<Integer> arr, int i, int j){
        while(i<j){
            int temp= arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here
        int n = arr.size();
        k = k%n;
        if (k==0) return arr;
       
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
         reverse(arr,0,n-1);
         
        return arr;
    }
}
