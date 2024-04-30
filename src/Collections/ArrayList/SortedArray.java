package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedArray {
   public static void main(String[] args){
       int m=3;
       int n=3;
   int[] arr1 = {1,2,3,0,0,0};
   int[] arr2 = {2,5,6};
   int[] result = new int[arr1.length+ arr2.length];
   int[] sol = new int[m+n];
   int index=0;

   for(int i=0;i< arr1.length;i++){
       result[i]=arr1[i];
   }
   for(int i=0;i<arr2.length;i++){
       result[arr1.length+i]=arr2[i];
   }
  // for(int i=0;i< result.length;i++)
    //   System.out.print(result[i]);

   Arrays.sort(result);
       for(int i=0;i< result.length;i++)
           System.out.print(result[i]);

       for(int i=0;i<result.length;i++){
           if(result[i]!=0){
               sol[index]=result[i];
               index++;
           }
       }
       System.out.println();
       for(int i=0;i< sol.length;i++){
           arr1[i]=sol[i];
           System.out.print(arr1[i]);
       }








   }
}