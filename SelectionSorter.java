
public class SelectionSorter
{
	public static void main(String[] args) 
	   {
			int[] a1 = SortMethod.randomIntArray(2000, 10000.0);
			int[] a2 = SortMethod.randomIntArray(4000, 10000.0);
			int[] a3 = SortMethod.randomIntArray(6000, 10000.0);
			int[] a4 = SortMethod.randomIntArray(8000, 10000.0);
			int[] a5 = SortMethod.randomIntArray(10000, 10000.0);
			
			//Selection Sorting 
			System.out.println("Selection Sort Comparison: ");
			//SortMethod.printArray(a1);
			//System.out.println();
			SelectionSort.selectionSortComparisons(a1);
			//SortMethod.printArray(a1);
			//System.out.println();
			SelectionSort.selectionSortComparisons(a2);
			SelectionSort.selectionSortComparisons(a3);
			SelectionSort.selectionSortComparisons(a4);
			SelectionSort.selectionSortComparisons(a5);
			System.out.println();
			
			a1 = SortMethod.randomIntArray(2000, 10000.0);
			a2 = SortMethod.randomIntArray(4000, 10000.0);
			a3 = SortMethod.randomIntArray(6000, 10000.0);
			a4 = SortMethod.randomIntArray(8000, 10000.0);
			a5 = SortMethod.randomIntArray(10000, 10000.0);
	
			//Bubble Sorting
			System.out.println("Bubble Sort Comparison: ");
			//SortMethod.printArray(a1);
			//System.out.println();
			BubbleSort.bubbleSortComparison(a1);
			//SortMethod.printArray(a1);
			//System.out.println();
			BubbleSort.bubbleSortComparison(a2);
			BubbleSort.bubbleSortComparison(a3);
			BubbleSort.bubbleSortComparison(a4);
			BubbleSort.bubbleSortComparison(a5);
			System.out.println();
			
			a1 = SortMethod.randomIntArray(2000, 10000.0);
			a2 = SortMethod.randomIntArray(4000, 10000.0);
			a3 = SortMethod.randomIntArray(6000, 10000.0);
			a4 = SortMethod.randomIntArray(8000, 10000.0);
			a5 = SortMethod.randomIntArray(10000, 10000.0);
			
			//Merge Sorter
			System.out.println("Merge Sort Comparison: ");
			//SortMethod.printArray(a1);
			//System.out.println();
			MergeSort.mergeSortComparison(a1);
			//SortMethod.printArray(a1);
			//System.out.println();
			MergeSort.mergeSortComparison(a2);
		    MergeSort.mergeSortComparison(a3);
		    MergeSort.mergeSortComparison(a4);
		    MergeSort.mergeSortComparison(a5);
		}
	


	
}
