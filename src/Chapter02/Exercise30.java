/*(Separating the Digits in an Integer) Write an application 
that inputs one number consisting of five digits from the user,
separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, 
if the user types in the number 42339, the program should print 4 2 3 3 9
Assume that the user enters the correct number of digits.
What happens when you enter a number with more than five digits? 
What happens when you enter a number with fewer than five digits? 
[Hint: It’s possible to do this exercise with the techniques you 
learned in this chapter. You’ll need to use both division and 
remainder operations to “pick off” each digit.]*/
package Chapter02;

import java.util.Scanner;

public class Exercise30 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, num1, num2, num3, num4, num5;
		
		System.out.print("Enter number with five digits: ");
		num = input.nextInt(5);		
		input.close();
				
		num1 = num / 10000;
		num2 = (num % 10000) / 1000;
		num3 = ((num % 10000) % 1000) / 100;
        num4 = (((num % 10000) % 1000) % 100) / 10;
        num5 = (((num % 10000) % 1000) % 100) % 10;
		
		System.out.printf("%d%s%d%s%d%s%d%s%d%n", num1, "   ", num2, "   ", num3, "   ", num4, "   ", num5);
	}	
}
