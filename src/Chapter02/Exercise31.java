/*(Table of Squares and Cubes) Using only the programming techniques 
 * you learned in this chapter, write an application 
 * that calculates the squares and cubes of the numbers 
 * from 0 to 10 and prints the resulting values in table format*/
package Chapter02;

public class Exercise31 {
	
	public static void main(String[] args) {
				
		System.out.println("number\t square\t cubes");
		
		for (int num = 0; num <= 10; num++) {
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
//	System.out.printf("\n   " + num + "        " + num*num + "        " + num*num*num);
		}
	  	
	}
}
//Using only the programming techniques you learned in this chapter..
// можно ли использовать цикл for?(
//как вариант - прописать 11 строк..
//num = 0;
//System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
//num = 1; ...