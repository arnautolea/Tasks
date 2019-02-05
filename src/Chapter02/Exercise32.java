/*(Negative, Positive and Zero Values) Write a program that inputs 
 five numbers and determines and prints the number of negative numbers input, 
the number of positive numbers input and the number of zeros input.*/

package Chapter02;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, num5;
		int pos = 0;
		int neg = 0;
		int zero = 0;
		Scanner input = new Scanner(System.in);
			
			System.out.println("Enter five numbers! ");// prompt
			
			System.out.print("Enter first number: "); //prompt
			num1 = input.nextInt(); // read number from user
			System.out.print("Enter second number: ");
			num2 = input.nextInt();// read number from user
			System.out.print("Enter third number: ");
			num3 = input.nextInt();// read  number from user
			System.out.print("Enter fourth number: ");
			num4 = input.nextInt();// read number from user
			System.out.print("Enter fifth number: ");
			num5 = input.nextInt();// read number from user
		input.close();
				
		//search for positive numbers
		if (num1 > 0)
			pos++;
		if (num2 > 0)
			pos++;
		if (num3 > 0)
			pos++;
		if (num4 > 0)
			pos++;
		if (num5 > 0)
			pos++;
		
		//search for negative numbers
		if (num1 < 0)
			neg++;
		if (num2 < 0)
			neg++;
		if (num3 < 0)
			neg++;
		if (num4 < 0)
			neg++;
		if (num5 < 0)
			neg++;
				
		//search for zero numbers
		if (num1 == 0)
			zero++;
		if (num2 == 0)
			zero++;
		if (num3 == 0)
			zero++;
		if (num4 == 0)
			zero++;
		if (num5 == 0)
			zero++;
		
		System.out.printf("Total positive numbers: %d\n", pos);
		System.out.printf("Total negative numbers: %d\n", neg);
		System.out.printf("Total zero numbers: %d", zero);
	} //close main
} // close class
