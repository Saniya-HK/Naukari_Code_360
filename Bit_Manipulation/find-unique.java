import java.util.*;
public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
    int xor=0;
    for (int i=0; i<arr.length; i++){
      xor= xor^arr[i];
    }
    return xor;
    }
}
