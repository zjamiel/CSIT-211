package chapter15;
/* Name: Zahra Abdulwahab
 * Source file name: UnorderedListADT.java
 * Description of program: This is an interface of the operations particular to an unordered list.
 * IDE used: Eclipse 
*/
public interface UnorderedListADT<T> extends ListADT<T> {

	// Adds an element to the front of the list
	public void addToFront(T element);
	
	// Adds an element to the rear of the list
	public void addToRear(T element);
	
	// Adds an element after a particular element already in the list
	public void addAfter(T element, T target);
}
