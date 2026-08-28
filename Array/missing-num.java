public class Solution {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        int sum=(N+1)*(N)/2;
        int arrsum=0;
        for (int i=0; i<a.length;i++){
            arrsum+=a[i];
        }
        return sum-arrsum;
    }
}
