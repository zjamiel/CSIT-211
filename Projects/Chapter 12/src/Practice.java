
import java.util.Stack;

public class Practice {

	// Function to reverse a string in Java using a stack and character array
		public static String reverse(String str)
		{
			// base case: if string is null or empty
			if (str == null || str.equals(""))
				return str;

			// create an empty stack of characters
			Stack<Character> stack = new Stack<Character>();

			// push every character of the given string into the stack
			char[] ch = str.toCharArray();
			for (int i = 0; i < str.length(); i++)
				stack.push(ch[i]);

			// start from index 0
			int k = 0;

			// pop characters from the stack until it is empty
			while (!stack.isEmpty())
			{
				// assign each popped character back to the character array
				ch[k++] = stack.pop();
			}

			// convert the character array into string and return it
			return String.copyValueOf(ch);
		}

		public static void main (String[] args)
		{
			String str = "Reverse me!";

			str = reverse(str);		// string is immutable

			System.out.println("Reversed string is: " + str);
			
			String hi = "Hello I'm your String";
			String[] splited = hi.split(" ");
			System.out.println(splited);
		}
}
