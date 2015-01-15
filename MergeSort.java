public class MergeSort extends SortMethod
{
	static int compCount1 = 0;
	
	public static void mergeSort( int[] a )
    {
        int[] tmpArray = new int[a.length];

        mergeSort( a, tmpArray, 0, a.length - 1 );
    }

   
    private static void mergeSort( int[] a, int[] tmpArray,
                                        int left, int right )
    {
        if( left < right )
        {
        	
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }

    
    private static void merge( int[] a, int[] tmpArray, int leftPos, 
    		                              int rightPos, int rightEnd )
    {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd )
        {
          compCount1++;
            if( a[leftPos] < a[rightPos])
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            else
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];
         }

        while( leftPos <= leftEnd )    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];
        compCount1++;
        while( rightPos <= rightEnd )  // Copy rest of right half
        {
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];
        compCount1++;
        }
        // Copy tmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- )
        {
            a[ rightEnd ] = tmpArray[ rightEnd ];
            compCount1++;
        }
    }
 
  public static void mergeSortComparison(int[] intArray)
  {
	  MergeSort.mergeSort(intArray);
	  System.out.println("Number of elements "+ intArray.length + ", Number of Passes: " + compCount1);
  }
} 