/*(Largest and Smallest Integers) Write an application that reads five 
integers and determines and prints the largest and smallest integers in the group.*/
package Chapter02;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		 		
		Scanner input = new Scanner(System.in); //create a Scanner
		
		int num1, num2, num3, num4, num5;
		
		System.out.println("Enter five integers: ");
		num1 = input.nextInt(); // read numbers from user
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		input.close();
	
		if ( num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5 )
			 System.out.println("Smallest number is " + num1);
	      else if ( num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5 )
	    	  System.out.println("Smallest number is " + num2);
	      else if ( num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5 )
	    	  System.out.println("Smallest number is " + num3);
	      else if ( num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5 )
	    	  System.out.println("Smallest number is " + num4);
	      else if ( num5 <= num1 && num5 <= num2 && num5 <= num3 && num5 <= num4 )
	    	  System.out.println("Smallest number is " + num5);
		 
		if ( num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 )
			 System.out.println("Largest number is " + num1);
	      else if ( num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5 )
	    	  System.out.println("Largest number is " + num2);
	      else if ( num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5 )
	    	  System.out.println("Largest number is " + num3);
	      else if ( num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5 )
	    	  System.out.println("Largest number is " + num4);
	      else if ( num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4 )
	    	  System.out.println("Largest number is " + num5);
	}
}	
//надо узнать как считывать массив и сравнивать числа в нем...