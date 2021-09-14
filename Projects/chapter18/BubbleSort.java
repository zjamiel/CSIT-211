package chapter18;

/* Name: Zahra Abdulwahab    
*  Source file name: Chap18_Proj_Su2020.java
*  description of program: This application sorted the specified array of objects using a bubble sort algorithm.
*  IDE used: Eclipse 
 */

public class BubbleSort {

	private static <T extends Comparable<T>>
	   void swap(T[] data, int index1, int index2)
	{
	   T temp = data[index1];
	   data[index1] = data[index2];
	   data[index2] = temp;
	}
	
	public static <T extends Comparable<T>>      
		  void bubbleSort(T[] data)
	{
		// Variables
		int position, scan;
		T temp;
		boolean sorted = false;
		
		while (!sorted) {
			sorted = true;
			for (position =  data.length - 1; position >= 0; position--) {
			
				for (scan = 0; scan <= position - 1; scan++) {
				
					if (data[scan].compareTo(data[scan+1]) > 0) {
						swap(data, scan, scan + 1);
						sorted = false;
					}
				}
			}
		}
	}
}