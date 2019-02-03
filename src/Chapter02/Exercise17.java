/*(Arithmetic, Smallest and Largest) Write an application that inputs 
three integers from the user and displays:
the sum, average, product, smallest and largest of the numbers.*/

package Chapter02;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //create a Scanner
		
		int num1, num2, num3, sum, aver, prod; //integer numbers
				
		System.out.print("Enter first integer: "); // prompt
		num1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		num2 = input.nextInt(); // read second number from user
		
		System.out.print("Enter third integer: "); // prompt
		num3 = input.nextInt(); // read third number from user
		input.close();
		sum = num1 + num2 + num3; // add numbers, then store total in sum
		System.out.printf("Sum is %d%n", sum); // display sum
		
		aver = (num1 + num2 + num3) / 3; // add numbers, then store total in aver
		System.out.printf("Average is %d%n", aver); // display average
		
		prod = num1 * num2 * num3; // add numbers, then store total in prod
		System.out.printf("Product is %d%n", prod); // display product
				
		 if ( num1 <= num2 && num1 <= num3 )
			 System.out.println("Smallest number is " + num1);
	      else if ( num2 <= num1 && num2 <= num3 )
	    	  System.out.println("Smallest number is " + num2);
	      else if ( num3 <= num1 && num3 <= num2 )
	    	  System.out.println("Smallest number is " + num3);
		 
		 if ( num1 >= num2 && num1 >= num3 )
			 System.out.println("Largest number is " + num1);
	      else if ( num2 >= num1 && num2 >= num3 )
	    	  System.out.println("Largest number is " + num2);
	      else if ( num3 >= num1 && num3 >= num2 )
	    	  System.out.println("Largest number is " + num3);
	  }
	
}

