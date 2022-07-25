package p3;

import java.util.Arrays;

public class Maximum_num_from_array_21 {

	
	public static void main(String args[])
	{
		//Method 1
		int array[]= {1,7,91,12,58} ;
		System.out.println("Given array is : ");
		for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i]+" ");
			}
		
		System.out.println("\n-----------------------------------------");
		Arrays.sort(array);
		System.out.println("\nMaximum no from array is : "+ array[array.length-1]);
		System.out.println("-----------------------------------------");
		
		//Method 2
		int array1[]= {201,25,85,69,45} ;
		int max = array[0]; 
			for(int j=0;j<array1.length;j++)
			{
				if(max<array1[j])
				{
					max=array1[j];
				}
			}
		System.out.println("\nMaximum no from array is : "+max);
		
	}
	
}
