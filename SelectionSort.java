
public class SelectionSort extends SortMethod
{
	public static void selectionSort (int[] intArray)
	{
		//Preconditions
		//	Input: unsorted integer array, Assumptions: array is full
		//Postconditions
		//	Output: none, Actions: array is sorted in ascending order
		int compCount3=0;
		
		for(int last = intArray.length - 1; last > 0; last--)
		{ 
			
			int indexOfLargest = last;
			
			// Find largest element in unsorted array
			for(int i = 0; i < last; i++)
			{
				compCount3++;
				if (intArray[i] > intArray[indexOfLargest])
				{
					indexOfLargest = i;
				} // end if
			} // end for
			
			// Swap last element with largest element
			int temp = intArray[last];
			intArray[last] = intArray[indexOfLargest];
			intArray[indexOfLargest] = temp;
			
			// Print partially sorted array
			//System.out.println("Pass " + (intArray.length - last));
			//printArray(intArray);
			
		} // end for
		System.out.println("Number of elements "+ intArray.length + ", Number of Passes: " + compCount3);
	}// end selectionSort
	
	
	public static void selectionSortComparisons(int[] intArray)
	   {
		   SelectionSort.selectionSort(intArray);
		  
	      //System.out.println("Comparisons for "+ intArray.length + ", elements: " + eleCount);
	   }


}
