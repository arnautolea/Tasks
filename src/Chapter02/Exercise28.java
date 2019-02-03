/*(Diameter, Circumference and Area of a Circle) Write an application that 
inputs from the user the radius of a circle as an integer and prints 
the circle’s diameter, circumference and area.*/

package Chapter02;

import java.util.Scanner;

public class Exercise28 {
	
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in); //create a Scanner
	      
		int radius;
			
		System.out.print("Enter radius: ");
		radius = input.nextInt();
		input.close();
		
		System.out.printf("Diameter of circle is: " + (radius * 2) + ("%n"));
						
		System.out.printf("Circumference of circle is: " + (2 * Math.PI * radius) + ("%n"));
						
	    System.out.printf("Area of circle is: " + (Math.PI * (radius * radius)) + ("%n"));
	
	
	}
}
