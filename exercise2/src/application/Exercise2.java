/* Exercise2.java
 * Checks whether number is divisible by both 5 and 6, or neither
   of them, or just one of them.
 * author: Nadine Castro (ST# 301105146)
 */
package application;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		//Declaration
		int number; //represents the whole number entered by the user
		Scanner input = new Scanner(System.in);

		//Prompts the user to input a whole number
		System.out.print("Enter a whole number: ");
		number = input.nextInt();

		/*Checks whether the number entered is divisible by both 5 and 6, neither of them
				or just one of them */
		if (number % 5 == 0 && number % 6 ==0) {
			System.out.printf("%d is divisible by both 5 and 6.", number);
		} else if (number % 5 != 0 && number % 6 !=0) {
			System.out.printf("%d is not divisible by either 5 or 6.",  number);
		} else if ((number % 5 == 0 && number % 6 != 0) || (number % 5 != 0 && number % 6 == 0)) {
			System.out.printf("%d is divisible by 5 or 6, but not both.", number);
		}

		input.close();
	}// end of main method

}//end of Exercise2 class
