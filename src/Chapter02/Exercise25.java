/*(Odd or Even) Write an application that reads an integer 
  and determines and prints whether it’s odd or even. */

package Chapter02;

import java.util.Scanner;

public class Exercise25 {
	
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in); //create a Scanner
      
		int num;
		
		System.out.print("Enter number: ");
		num = input.nextInt();
		input.close();
		if ((num%2) == 0)
			 System.out.println("Number is even");
	    else 
			 System.out.println("Number is odd");
	}

}
