/*(Arithmetic) Write an application that asks the user to enter two integers,
obtains them from the user and prints their sum, product, 
difference and quotient (division).*/
package Chapter02;

import java.util.Scanner;

public class Exercise15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //create a Scanner
		
		int number1, number2, sum, prod, dif, quotient; //integer numbers
				
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user
		
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // read second number from user
		input.close();//close Scanner
		sum = number1 + number2; // add numbers, then store total in sum
		System.out.printf("Sum is %d%n", sum); // display sum
		
		prod = number1 * number2; // add numbers, then store total in prod
		System.out.printf("Product is %d%n", prod); // display product
		
		dif = number1 - number2; // add numbers, then store total in dif
		System.out.printf("Difference is %d%n", dif); // display difference
		
		quotient = number1 / number2; // add numbers, then store total in quotient
		System.out.printf("Quotient is %d%n", quotient); // display quotient
	}
	
}