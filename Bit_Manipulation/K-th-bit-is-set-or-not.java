public class Solution {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        if ((n&(1<<(k-1))) != 0) return true;
        else return false;
    }
}

// if k 0-based 
// ---(n & (1 << k)) != 0


// if k 1-based 
// ---(n & (1 << (k-1))) != 0
