import java.util.* ;
import java.io.*; 

public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
		int curr=0;
		int maxGain=0;
		int ones=0;
		for (int i=0; i<n ; i++){
			if (arr[i]==1){
				ones++;
				curr--;
			}
			else curr++;

			maxGain = Math.max(maxGain, curr);
			if(curr<0){
				curr=0;
			}
		}

		return ones+maxGain;
	}
}
