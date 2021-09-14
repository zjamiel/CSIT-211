package chapter17;

/* Name: Zahra Abdulwahab   
*  Source file name: Chap17_Proj_Su2020.java
*  description of program: This application uses recursion to determine and print the Nth line of Pascal’s Triangle. It prompts the user for the row count then prints Pascal’s Triangle
*  up to that row.
*  IDE used: Eclipse 
 */

import java.util.Scanner;

public class Chap17_Proj_Su2020 {

	public static int[] computePascal(int k) {
		
		// Array of the values
		int[] row; 
		
		if (k < 1) {
			
			// Empty array
			row = new int[0];
		} 
		else 
			
			if (k == 1) {
				
				// First row
				row = new int[] {1};
			} 
			else {
				
				// Previous row
	            int[] prev = computePascal(k-1);
	            
	            // Current row
	            row = new int[k];

	            // Outer elements for all rows
	            row[0] = 1;
	            row[k-1] = 1;
	            
	            // Interior value is the sum of the two values above it
	            for (int i = 1; i < k-1; i++) {
	            	row[i] = prev[i-1] + prev[i];
	            }
	        }
		
	        return row;
	    }
	    
	public static void main(String[] args) {
	       
		// Variables
		int rowCount;
		
		// Title
		System.out.println("\t\t\t\t  Pascal’s Triangle");
		System.out.println("");
		
		// Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Prompt user for row count
		System.out.print("\t\t\t\tEnter number of rows: ");
		rowCount = scan.nextInt();
		System.out.println("");
		
		// Print Pascal’s Triangle up to rowCount
		for (int x = 0; x < rowCount; x++) {
			
			int[] row = computePascal(x+1);
			
			System.out.print("\t\t\t\t");
			
			for (int i = 0; i < (rowCount - x); i++) {
				System.out.print(" ");
			}
			
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i]+" ");
			}
			
			System.out.println();
		}
	}
}