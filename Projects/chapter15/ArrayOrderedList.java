package chapter15;

/* Name: Zahra Abdulwahab
 * Source file name: ArrayOrderedList.java
 * Description of program: This application utilizes the operations that are specific to ordered lists.
 * IDE used: Eclipse 
*/

public class ArrayOrderedList<T> extends ArrayList<T> implements OrderedListADT<T> {	
	
	// Creates an empty list using the default value
	public ArrayOrderedList() {
		super();
	}

	// Creates an empty list using specified capacity
	public ArrayOrderedList(int initialCapacity) {
		super(initialCapacity);
	}

	// Adds an element to the list
	public void add(T element) { 
		
		// Variables
		int input = 0;
		
		if (size() == list.length) {
			expandCapacity();
		}
		
		Comparable<T> orderedList = (Comparable<T>)element;

		while (input < rear && orderedList.compareTo(list[input]) > 0) {
			input++;
		}

		for (int input2=rear; input2 > input; input2--) {
			list[input2] = list[input2-1];
		}
	      
		list[input] = element;
		rear++;
	}
	
}