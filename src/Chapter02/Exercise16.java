/*(Comparing Integers) Write an application that asks the user to enter two integers, 
 obtains them from the user and displays the larger number 
 followed by the words "is larger". 
 If the numbers are equal, print the message "These numbers are equal".*/
package Chapter02;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //create a Scanner
		
		int num1, num2;
		
		System.out.print("Enter first integer: "); // prompt
		num1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		num2 = input.nextInt(); // read second number from user
		input.close(); //close Scannner
		//Comparing Integers
		if (num1 > num2) {
			System.out.println(num1 + " is larger");
		}
		if (num1 < num2) {
			System.out.println(num2 + " is larger");
		}
		if (num1 == num2) {
			System.out.println("These numbers are equal");
		}
	}	
}
