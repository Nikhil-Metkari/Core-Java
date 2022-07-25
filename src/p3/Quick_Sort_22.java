package p3;

public class Quick_Sort_22 {
	
	 public static  int partition(int[] arr, int low, int high)
	{
	     
	    // pivot
	    int pivot = arr[(low+high)/2];
	   
	     
	    while(low<=high)
	    {
	    	while(arr[low]<pivot)
	    	{
	    		low++;
	    	}
	    	while(arr[high]>pivot)
	    	{
	    		high--;
	    	}
	    	if(low<=high)
	    	{
	    		int temp = arr[low];
	    		arr[low]= arr [high];
	    		arr[high]=temp;
	    		
	    		low++;
	    		high--;
	    	}
	    }
	  return low;
	}
	
	
	
	public static void quickSort(int[] arr, int low,int high)
	{
		
		if(low<high)
		{
			 // p is partitioning index, arr[p]
			int  p = partition(arr, low, high);
			if(low<p-1)
			{
				quickSort(arr,low,p-1);
			}
			if(p<high)
			{
				quickSort(arr,high,p);
			}
			
		}
		
	}
	public static void Printarr(int [] arr)
	{
		for(int i :arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 7, 8, 9, 1, 5 };
		System.out.println("Before quick sort :");
		Printarr(arr);
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		System.out.println("\nAfter quick sort :");
		Printarr(arr);
		
	}

}
