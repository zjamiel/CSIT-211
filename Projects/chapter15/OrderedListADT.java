package chapter15;
/* Name: Zahra Abdulwahab
 * Source file name: OrderedListADT.java
 * Description of program: This is an interface of the operation particular to an ordered list.
 * IDE used: Eclipse 
*/

public interface OrderedListADT<T> extends ListADT<T> {
	
	// Adds the specified element to this list at the proper location
	public void add(T element);
}