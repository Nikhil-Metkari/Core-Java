package p3;

public class Selection_sort_24 {

	
	public static void main(String args[])
	{
		int arr[] = {25,86,12,7,3,56};
		
		System.out.println("Before Selection sort array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

		for(int i=0;i<arr.length;i++)
		{
			int small=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[small]>arr[j])
				{
					small=j;
				}
			}
					int temp=arr[small];
					arr[small]=arr[i];
					arr[i]=temp;
				
			
		}
		System.out.println("\n----------------------------");
		System.out.println("After Selection sort array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
	}
}
