package p5;

import java.util.Arrays;

public class Second_higesh_no_45 {

	public static void main(String[] args) {


		int arr[]= {12,58,59,63,25,14};
		System.out.println("Given Array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n------------------------------------------------------------");
		Arrays.sort(arr);
		
		System.out.println("\nSecond highest number in array is : "+arr[arr.length-2]);

		
		System.out.println("------------------------------------------------------------");
		
		int temp = arr[0];
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(temp>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("Second highest number in array is : "+arr[arr.length-2]);
		
		
		
	}

}
