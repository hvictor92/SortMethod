
public class BubbleSort extends SortMethod
{
	public static void bubbleSortComparison(int[] intArray) 
	  {
		  int n = intArray.length;
	      int temp = 0;
	      int compCount2 = 0;
	      
	      for(int i=0; i < n; i++)
	      {
	              for(int j=1; j < (n-i); j++)
	              { 
	                     compCount2++;
	                      if(intArray[j-1] > intArray[j])
	                      {compCount2++;
	                              //swap the elements!
	                              temp = intArray[j-1];
	                              intArray[j-1] = intArray[j];
	                              intArray[j] = temp;
	                      }
	               }
	       }
	   
	      System.out.println("Number of elements "+ intArray.length + ", Number of Passes: " + compCount2);
	  }// end SortMethods

}
