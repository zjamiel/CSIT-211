package chapter15;
/* Name: Zahra Abdulwahab 
 * Source file name: ArrayList.java
 * Description of program: This application implements the ListADT interface and utilizes the common operations of a list.
 * IDE used: Eclipse 
*/

import java.util.Iterator;

public class ArrayList<T> implements ListADT<T> {
	
	// Constants and variables
	protected final int DEFAULT_CAPACITY = 100;
	private final int NOT_FOUND = -1;
	protected int rear;
	protected T[] list; 

	// Empty list is created using the default capacity
	public ArrayList() {
		rear = 0;
		list = (T[])(new Object[DEFAULT_CAPACITY]);
	}

	// Empty list is created using specified capacity
	public ArrayList (int initialCapacity) {
		rear = 0;
		list = (T[])(new Object[initialCapacity]);
	}

	// Removes the first element from the list
	public T removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		
		T result = list[0];
		rear--;
		
		// shift the elements
		for (int input=0; input < rear; input++) {
			list[input] = list[input+1];
		}

		list[rear] = null;
		
		return result;
	}
	
	// Removes the last element from the list
	public T removeLast () {
		T result;

		if (isEmpty()) {
			System.out.println("List is empty");
		}
		
		rear--;
		result = list[rear];
		list[rear] = null;
		
		return result;
	}

	// Removes a particular element from the list
	public T remove (T element) {
		
		// Variables
		T result;
		int index = find (element);

		if (index == NOT_FOUND) {
			System.out.println("Element was not found");
		}

		result = list[index];
		rear--;
		
		// shift the appropriate elements
		for (int input=index; input < rear; input++) {
			list[input] = list[input+1];
		}

		list[rear] = null;
		
		return result;
	}

	// Examines the element at the front of the list
	public T first() {
		
		if (isEmpty()) {
			System.out.println("List is empty");
		}

		return list[0];
	}

	// Examines the element at the rear of the list
	public T last() {
		
		if (isEmpty()) {
			System.out.println("List is empty");
		}

		return list[rear-1];
	}

	// Determines if the list contains a particular element
	public boolean contains (T target) {
		return (find(target) != NOT_FOUND);
	}

	// Returns the array index of the specified element, or the constant NOT_FOUND if it is not found
	private int find (T target) {
		
		// Variables
		int input = 0, result = NOT_FOUND;
		boolean found = false;

		if (! isEmpty()) {
			
			while (! found && input < rear)
				
				if (target.equals(list[input])) {
					found = true;
				}
				else
					input++;
		}

		if (found) {
			result = input;
		}

		return result;
	}

	// Determines if the list is empty (returns true if empty, false otherwise)
	public boolean isEmpty() {
		return (rear == 0);
	}
 
	// Determines the number of elements on the list
	public int size() {
		return rear;
	}

	// Returns an iterator for the elements currently in the list
	public Iterator<T> iterator() {
		return null;
	}

	// Returns a string representation of the list
	public String toString() {
		
		// Variables
		String result = "";

		for (int input=0; input < rear; input++) {
			result = result + list[input].toString() + "\n";
		}

		return result;
	}

	// Creates a new array with twice the capacity of the old one
	protected void expandCapacity() {
		
		T[] larger = (T[])(new Object[list.length*2]);

		for (int input=0; input < list.length; input++) {
			larger[input] = list[input];
		}

		list = larger;
	}
   
}