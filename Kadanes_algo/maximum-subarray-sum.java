import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum =0;
		long maxSum = 0;


		for (int i=0; i<n; i++){
			sum+=arr[i];

			maxSum = Math.max(sum, maxSum);;

			if (sum<0){
				sum=0;
			}
		}

		return maxSum;
	}

}
