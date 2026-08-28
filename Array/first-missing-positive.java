import java.util.* ;
import java.io.*; 
public class Solution {
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.
		int i=0;
		while (i<n){
			int correct=arr[i]-1;

			if (arr[i]>0 && arr[i]<=n && arr[i]!=arr[correct]){
				int temp = arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
			else {
				i++;
			}
		}

		for (int idx=0;idx<n;idx++){
			if (arr[idx]!=idx+1){
				return idx+1;
			}
		}
		return n+1;
	}
}



























