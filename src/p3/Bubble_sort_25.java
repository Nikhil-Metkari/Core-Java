package p3;

//bubble sort
public class Bubble_sort_25 {

	public static void main(String args[])
	{
		int arr[] = {25,86,12,7,3,56};
		int temp;
		System.out.println("Before Bubble sort array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n-------------------------------------------------");
		System.out.println("After Bubble sort array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	
}
