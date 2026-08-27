import java.util.*;

public class Solution {
	public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		// Write your code here.
		int idx=-1;

		for (int i=0; i<arr.size(); i++){
			if (arr.get(i)==0){
				idx=i;
				break;
			}
		}

		if (idx==-1){
			return;
		}

		for (int i=idx+1; i<arr.size(); i++){
			if (arr.get(i)!=0){
				int temp= arr.get(i);
				arr.set(i,arr.get(idx));
				arr.set(idx,temp);
				idx++;
			}
		}
	}
}
