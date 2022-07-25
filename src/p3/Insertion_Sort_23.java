package p3;

public class Insertion_Sort_23 {

	public static void main(String[] args)
	{
        int arr[] = {25,86,12,7,3,56};
		int i,j,small;
		System.out.println("Before Insertion sort array is : ");
		for( i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		for(i=1;i<arr.length;i++)
		{
			small = arr[i];
			for(j=i-1;j>=0 && small < arr[j];j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=small;
		}
		System.out.println("\nAfter Insertion sort array is : ");
		for( i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
