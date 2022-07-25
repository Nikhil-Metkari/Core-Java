package p2;

public class Merge_Sort_18 {

//	
//	
//	  void sort(int arr[], int low, int high)
//	  {
//	    if (low < high) {
//	      // Find the middle point
//	      int mid =low+ (high-low)/2;
//
//	      // Sort first and second halves
//	      sort(arr, low, mid);
//	      sort(arr, mid + 1, high);
//
//	      // Merge the sorted halves
//	      merge(arr, low, mid, high);
//	    }
//	  }
//	  
//	  
//	  void merge(int arr[], int low, int mid, int high)
//	  {
//	    // Find sizes of two subarrays to be merged
//	    int n1 = mid - low + 1;
//	    int n2 = high - mid;
//
//	    /* Create temp arrays */
//	    int L[] = new int[n1];
//	    int R[] = new int[n2];
//
//	    /*Copy data to temp arrays*/
//	    for (int i = 0; i < n1; ++i)
//	      L[i] = arr[low + i];
//	    for (int j = 0; j < n2; ++j)
//	      R[j] = arr[mid + 1 + j];
//
//	    /* Merge the temp arrays */
//
//	    // Initial indexes of first and second subarrays
//	    int i = 0, j = 0;
//
//	    // Initial index of merged subarray array
//	    int k = low;
//	    while (i < n1 && j < n2) {
//	      if (L[i] <= R[j]) {
//	        arr[k] = L[i];
//	        i++;
//	      }
//	      else {
//	        arr[k] = R[j];
//	        j++;
//	      }
//	      k++;
//	    }
//
//	    /* Copy remaining elements of L[] if any */
//	    while (i < n1) {
//	      arr[k] = L[i];
//	      i++;
//	      k++;
//	    }
//
//	    /* Copy remaining elements of R[] if any */
//	    while (j < n2) {
//	      arr[k] = R[j];
//	      j++;
//	      k++;
//	    }
//	  }
//
//	 //----------------------***********Sort*************-----------------------------
//	
//
//	
//	  static void printArray(int arr[])
//	  {
//	    int n = arr.length;
//	    for (int i = 0; i < n; ++i)
//	      System.out.print(arr[i] + " ");
//	    System.out.println("\n-----------------------------------------------------");
//	  }
//
//	
//	  public static void main(String args[])
//	  {
//	    int arr[] = { 12, 11, 13, 5, 6, 7 };
//
//	    System.out.println("Given Array");
//	    printArray(arr);
//
//	    Merge_Sort_18 ob = new Merge_Sort_18();
//	    ob.sort(arr, 0, arr.length - 1);
//
//	    System.out.println("\nSorted array");
//	    printArray(arr);
//	  }
//}
	

	

	
	int array[];
	int tempMergeArr[];
	int length;


	public static void main(String[] args) 
	{
		
		int arr[]= {48,36,13,52,19,94,21};
         
		 Merge_Sort_18 m = new  Merge_Sort_18();
		 m.sort(arr);
		 System.out.println("Sorted array is :");
		 for(int i:arr)
			{
				System.out.println(i);
			}
	}
	public void sort(int [] arr)
	{
		this.array=arr;
		this.length=arr.length;
		this.tempMergeArr=new int[length];
		divide(0,length-1);
		
	}
	
	public void divide(int lowerindex,int higherindex)
	{
		if(lowerindex<higherindex)
		{
		int middle= lowerindex + (higherindex - lowerindex)/2;
		divide(lowerindex,middle);
		divide(middle+1,higherindex);
		mergearray(lowerindex,middle,higherindex);
		}
	}

	public void mergearray(int lowerindex,int middle,int higherindex)
	{
		for(int f=lowerindex ;f<=higherindex;f++)
		{
			tempMergeArr[f]=array[f];
		}
		
		int i = lowerindex;
		int j = middle+1;
		int k = lowerindex;
		
		while(i<=middle && j<=higherindex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else {
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{ 
			array[k]=tempMergeArr[i];
			i++;
			k++;
		}
		
	}
}

