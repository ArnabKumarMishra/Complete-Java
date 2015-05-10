//Comparision.java
// Compare integers using if statements, relational operators and equality operators
import java.util.Scanner;

public class Comparision{

	// main method begins execution of Java applications 
	public static void main(String[] args){

		// create Scanner object to get user input from the terminal
		Scanner input = new Scanner(System.in);

		int number1; // first number to compare
		int number2; // second number to compare

		System.out.println("Enter the first integer: ");
		number1 = input.nextInt();

		System.out.println("Enter the second integer: ");
		number2 = input.nextInt();

		if(number1 == number2){

			System.out.println("The entered integers are equal");

		}

		else if(number1>number2){

			System.out.println("The first integer is greater than the second one");

		}

		else{

			System.out.println("The second integer entered is greater than the first one");

		}

	} //end of main

} // end of class Comparision