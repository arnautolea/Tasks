/*(Multiples) Write an application that reads two integers, 
 determines whether the first is a multiple of the second and prints the result. [Hint: Use the remainder operator.]*/
package Chapter02;

import java.util.Scanner;

public class Exercise26 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //create a Scanner
		
		int num1, num2;
		
		System.out.print("Enter first integer: "); // prompt
		num1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		num2 = input.nextInt(); // read second number from user
		input.close();
		if ((num1 % num2) == 0)
			 System.out.println("First number multiple second " + (num1 / num2) + (" times"));
	    else
			 System.out.println("First number is not multiple of the second");
	}
}
