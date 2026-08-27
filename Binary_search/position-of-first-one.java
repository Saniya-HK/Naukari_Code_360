public class Solution 
{
    public static int getFirstPosition(int[] arr, int n) 
    {
        // Write your code here.
        int low =0;
        int high = arr.length-1;
        int ans =-1;

        while(low<=high)
        {
            int mid =low +(high-low)/2;

            if (arr[mid]==1){
                ans=mid+1;
                high=mid-1;
            }
            else if (arr[mid]>1) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
}
