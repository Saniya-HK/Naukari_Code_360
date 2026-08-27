
import java.util.*;
public class Solution {
	public static long reverseBits(long n) {
		// Write your code here
	
	long ans =0;

	for (int i=0; i<32; i++)
	{
		ans = ans << 1;

		ans = ans | (n&1);

		n=n>>>1;
	}
	return ans;
	}
	
}
