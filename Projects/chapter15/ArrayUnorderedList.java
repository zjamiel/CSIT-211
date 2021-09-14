package chapter15;
/* Name: Zahra Abdulwahab
 * Source file name: ArrayUnorderedList.java
 * Description of program: This application utilizes the operations that are specific to unordered lists.
 * IDE used: Eclipse 
*/

public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {
	
	//  Creates an empty list using the default capacity
	public ArrayUnorderedList()	{
		super();
	}

	//  Creates an empty list using the specified capacity
	public ArrayUnorderedList (int initialCapacity)	{
		super(initialCapacity);
	}

   //  Adds the specified element to the front of the list
   public void addToFront (T element) {
	   
	   if (size() == list.length) {
		   expandCapacity();
	   }

	   // shift elements to make room
	   for (int input=rear; input > 0; input--) {
		   list[input] = list[input-1];
	   }

	   list[0] = element;
	   rear++;
   }

   //  Adds the specified element to the rear of the list
   public void addToRear (T element) {
	   
	   if (size() == list.length) {
		   expandCapacity();
	   }

	   list[rear] = element;
	   rear++;
   }

   //  Adds the specified element after the specified target element. Throws a ElementNotFoundException if the target is not found
   public void addAfter (T element, T target) {
	   
	   // Variables
	   int input = 0;
	   
	   if (size() == list.length) {
		   expandCapacity();
	   }

	   while (input < rear && !target.equals(list[input])) {
		   input++;
	   }
      
	   if (input == rear) {
		   System.out.println("Element not in the list");
	   }
    
	   input++;
	   
	   for (int input2=rear; input2 > input; input2--) {
		   list[input2] = list[input2-1];
	   }
	   
	   list[input] = element;
	   rear++;
   }
}
