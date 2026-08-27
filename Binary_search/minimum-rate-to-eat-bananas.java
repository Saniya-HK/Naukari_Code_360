import java.util.*;
public class Solution {
    public static int minimumRateToEatBananas(int []v, int h) {
        // Write Your Code Here
        int low = 1;
        int high = Arrays.stream(v).max().getAsInt();
        int ans=-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int needed = ispossible(v,mid);
            if (needed<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    
    }
    public static int ispossible(int []v, int mid){
        int hours=0;
  
        for (int pile: v){
            hours+=Math.ceil((double)pile/mid);
        }
            
        return hours;
    }
}



