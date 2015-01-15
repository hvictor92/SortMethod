public class SortMethod{

	
		
	/*public static void printArray(int[] intArray){
		//Preconditions
		//	Input: unsorted integer array	
		//	Assumptions: array is full
		//Postconditions
		//	Output: none
		//	Actions: array is displayed on screen*/
		
	public static int[] randomIntArray(int n, double range){
		//Preconditions
		//	Input: size of array(n), range of integers (0 to range)
		//	Assumptions: none
		//Postconditoins
		//	Output: array of random integers 0 to floor(range) 
		//	Actions: none
		
		int[] intArray = new int[n];
		
		for(int i = 0; i < n; i++){
			intArray[i] = (int)(Math.random() * range);
		} // end for
		
		return intArray;
		
	} // end randomIntArray
	
	public static int[] copyArray(int[] intArray){
		//Preconditions
		//	Input: integer array
		//	Assumptions: array is full
		//Postconditions
		//	Output: array of random integers 0 to floor(range) 
		//	Actions: none
		
		int[] copyArray = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++){
			copyArray[i] = intArray[i];
		} // end for
		
		return copyArray;
		
	} // end copyArray
	
	public static void printArray(int[] intArray)
	{int tempPlace = 0;
		while( intArray[tempPlace] != intArray[intArray.length-1])
		{
			System.out.print(intArray[tempPlace] + "; ");
			tempPlace++;
		}
	}
		
   
}
