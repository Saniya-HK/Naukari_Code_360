import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
         int i=0; 
         while (i<n){
             int correct = arr.get(i)-1;

             if (arr.get(i)==arr.get(correct)){
                 i++;
             }
             else{
                 int temp = arr.get(i);
                 arr.set(i,arr.get(correct));
                 arr.set(correct,temp);
             }
         }

         for (int j=0; j<n;j++){
             if(arr.get(j)!=j+1){
                 return arr.get(j);
             }
         }
         return -1;
    }
}
