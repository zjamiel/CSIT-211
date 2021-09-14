package chapter7;
/* Name: Zahra Abdulwahab   
*  Source file name: Chap7_Proj_Su2020.java
*  description of program: This application prompts the user to enter however many integers they want, in the range 0 to 50 inclusive. Then it will count the occurrences of each integer entered and display those values.
*  IDE used: Eclipse 
 */

import java.util.Scanner; 

public class Chap7_Proj_Su2020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		// Variables 
		int integer, 
			total = 0;
		
		// Title
		System.out.println("\t\t\t\t\t  Integer Occurrences");
		System.out.println("");
		
		System.out.print ("\t\t\t\tHow many numbers would you like to enter? "); // Determines the arbitrary number of integers
		integer = scan.nextInt();
				
		System.out.println(""); // spacing purposes 
		
		int[] numbers = new int[integer];
		
		for (int i = 0; i < integer; i++) // initializing the array
		{
			System.out.print ("\t\t\t\tEnter an integer from 0 to 50 inclusive: ");
			numbers[i] = scan.nextInt();
			
			if (numbers[i] < 0 || numbers[i] > 50) // Checks if number entered is within valid range
			{
				System.out.println("\t\t\t\t" + numbers[i] + " is not a valid number.");
				System.out.print ("\t\t\t\tEnter an integer from 0 to 50 inclusive: ");
				numbers[i] = scan.nextInt();
			}	

		}		
		
		System.out.println(""); // spacing purposes 
		
		// Designing the output
		System.out.println("\t\t\t\t\t     The values");
		System.out.println("");
		System.out.println("  \t\t\t\t\tInteger" + "\t   Occurrences");
		
		// Counting the occurrences of each integer
		for (int t = 0; t < 51; t++) 
		{
			for (int i = 0; i < integer; i++) 
			{
				if (t == numbers[i]) 
				{
					total = total + 1;
				}
			}
			
			if (total > 0) 
			{
			System.out.println("\t\t\t\t\t   " + t + "\t        " + total);
			total = 0;
			}
		}
		
	}
}
