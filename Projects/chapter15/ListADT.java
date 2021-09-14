package chapter15;
/* Name: Zahra Abdulwahab 
 * Source file name: ListADT.java
 * Description of program: This is an interface of the common operations on a list.
 * IDE used: Eclipse 
*/

import java.util.Iterator;

public interface ListADT<T> extends Iterable<T> {
	
	// Removes the first element from the list
	public T removeFirst();

	// Removes the last element from the list
	public T removeLast();

	// Removes the specified element from the list
	public T remove(T element);

	// Examines the element at the front of the list 
	public T first();

	// Examines the element at the rear of the list
	public T last();

	// Determines if the list contains the specified element
	public boolean contains(T target);

	// Determines if the list is empty
	public boolean isEmpty();

	// Determines the number of elements on the list
	public int size();

	// Returns an iterator for the elements in this list
	public Iterator<T> iterator();
	
	// Returns a string representation of the list
	public String toString();
}
