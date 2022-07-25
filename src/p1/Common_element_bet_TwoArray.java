package p1;

import java.util.Arrays;
import java.util.HashSet;

public class Common_element_bet_TwoArray {


	public static void main(String[] args) {

		
      int arr[]= {1,5,2,4,8,9,3};
      int arr1[]= {1,58,4,6,8,3,57,3};
		
      System.out.println("First Array is : "+Arrays.toString(arr));
      System.out.println("Second Array is : "+Arrays.toString(arr1));
      //Method1
      System.out.println("Common elements are : ");
      for(int i=0;i<arr.length;i++)
      {
    	  int  cnt=0;
    	  for(int j=0;j<arr1.length;j++)
    	  {
    		
    	      if(arr[i]==arr1[j])
    	      {
    	    	 cnt++;
    	      }  
    	  }
    	  if(cnt==1)
	      {
	    	  System.out.print(arr[i]+" ");
	      }
      }
      System.out.println("\n----------------------------------------");
      //Method 2
      HashSet set1 = new HashSet();
      HashSet set2 = new HashSet();
      for(int i:arr)
      {
    	  set1.add(i);
      }
      for(int i1:arr1)
      {
    	  set2.add(i1);
      }
      
     set2.retainAll(set1);
     System.out.println("Common Elements are : ");
     System.out.println(set2);

     System.out.println("\n----------------------------------------");
     
      
     
         
	}
}
