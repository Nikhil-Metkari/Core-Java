package p3;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_int_array_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array[]= {10, 54, 23, 89, 97, 2};
         
         System.out.println("Given array is : ");
         for(int i=0;i<array.length;i++)
         {
        	 System.out.print(array[i]+" ");
         }
         System.out.println("\n-------------------------------------");
         System.out.println("Reverse of array is : ");
         for(int i=array.length-1;i>=0;i--)
         {
        	 System.out.print(array[i]+" ");
         }
         System.out.println("\n-------------------------------------");
         
         //Method 2
         int a[]= {10, 54, 23, 89, 97, 2};
         Collections.reverse(Arrays.asList(a));
         System.out.println(Arrays.asList(a));
         
         System.out.println("\n-------------------------------------");
         
         // Method 3
         int ar1[]= {10, 54, 23, 89, 97, 2};
         int ar2[]=new int[ar1.length];
         int j = ar1.length;
         for(int i =0;i<ar1.length;i++)
         {
        	 ar2[j-1]=ar1[i];
        	 j=j-1;
         }
         System.out.println("Reverse of array is : ");
         for(int k=0;k<ar2.length;k++)
         {
        	 System.out.print(ar2[k]+" ");
         }
         
	}

}
