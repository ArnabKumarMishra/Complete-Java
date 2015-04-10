// Addition.java
// Addition program that inputs two numbers then displays their sum.

import java.util.Scanner;// Program uses class Scanner

public class Addition{

	// main method starts the execution of Java applications
	public static void main(String[] args){

		// Create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int sum;//sum of num1 and num2

		System.out.println("Enter the first number: ");
		num1 = input.nextInt();

		System.out.println("Enter the second number: ");
		num2 = input.nextInt(); 

		sum = num1 + num2;

		System.out.printf("Sum is %d%n", sum);
	}// end of main method

}// end of Addition class